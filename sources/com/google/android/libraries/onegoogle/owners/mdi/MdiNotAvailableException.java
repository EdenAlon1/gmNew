package com.google.android.libraries.onegoogle.owners.mdi;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MdiNotAvailableException extends Exception {

    /* compiled from: PG */
    public static final class ApiNotConnectedException extends MdiNotAvailableException {
        public ApiNotConnectedException() {
        }

        public ApiNotConnectedException(Throwable th) {
            super(th);
        }
    }

    /* compiled from: PG */
    public static final class DeveloperErrorException extends MdiNotAvailableException {
        public DeveloperErrorException() {
        }

        public DeveloperErrorException(Throwable th) {
            super(th);
        }
    }

    protected MdiNotAvailableException() {
    }

    protected MdiNotAvailableException(Throwable th) {
        super(th);
    }
}
