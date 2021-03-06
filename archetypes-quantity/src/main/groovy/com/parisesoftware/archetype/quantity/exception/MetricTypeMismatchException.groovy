package com.parisesoftware.archetype.quantity.exception

import com.parisesoftware.archetype.core.exception.TypeMismatchException

class MetricTypeMismatchException extends TypeMismatchException {

    MetricTypeMismatchException() {
        super('Both the target and parameter Quantity Objects must be in the same Metric.')
    }

}
