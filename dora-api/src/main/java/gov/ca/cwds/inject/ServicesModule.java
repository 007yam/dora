package gov.ca.cwds.inject;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import gov.ca.cwds.rest.services.es.IndexQueryService;

import javax.validation.Validation;
import javax.validation.Validator;

/**
 * Identifies all CWDS API business layer (aka, service) classes available for dependency injection
 * (aka, DI) by Google Guice.
 * 
 * @author CWDS API Team
 */
public class ServicesModule extends AbstractModule {

  /**
   * Default, no-op constructor.
   */
  ServicesModule() {
    // Default, no-op.
  }

  @Override
  protected void configure() {
    bind(IndexQueryService.class);
  }

  @Provides
  Validator provideValidator(){
    return Validation.buildDefaultValidatorFactory().getValidator();
  }
}
