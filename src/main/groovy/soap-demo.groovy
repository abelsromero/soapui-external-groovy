log.info ">" * 30
this.properties.each {
    log.info it
}

log.info "- BINDINGS ------------------------------------------------------"
binding.variables.each {
    log.info it
}

log.info "<" * 30

log.info(log.class.canonicalName)
log.info(context.dump())
log.info(context.class.canonicalName)
log.info(testRunner.class.canonicalName)

log.info "=" * 30

