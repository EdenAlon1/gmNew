package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum dgoz implements eyge {
    INVOCATION_TYPE_UNSPECIFIED(0),
    INVOCATION_TYPE_GIS_BEGIN_SIGNIN(1),
    INVOCATION_TYPE_GIS_CREDMAN_PROVIDER(2),
    INVOCATION_TYPE_GIS_FIDO_CLIENT(3),
    INVOCATION_TYPE_REDIRECTED_FIDO_PRIVILEGED_API_CLIENT(4),
    INVOCATION_TYPE_REDIRECTED_FIDO_API_CLIENT(5),
    INVOCATION_TYPE_FIDO_SECURITY_KEY_FLOW(6),
    INVOCATION_TYPE_FIDO_HYBRID_FLOW(7),
    INVOCATION_TYPE_FIDO_TEST_PURPOSE(8),
    INVOCATION_TYPE_MODULE_CREDMAN_PROVIDER(9);

    public final int k;

    dgoz(int i) {
        this.k = i;
    }

    public static dgoz b(int i) {
        switch (i) {
            case 0:
                return INVOCATION_TYPE_UNSPECIFIED;
            case 1:
                return INVOCATION_TYPE_GIS_BEGIN_SIGNIN;
            case 2:
                return INVOCATION_TYPE_GIS_CREDMAN_PROVIDER;
            case 3:
                return INVOCATION_TYPE_GIS_FIDO_CLIENT;
            case 4:
                return INVOCATION_TYPE_REDIRECTED_FIDO_PRIVILEGED_API_CLIENT;
            case 5:
                return INVOCATION_TYPE_REDIRECTED_FIDO_API_CLIENT;
            case 6:
                return INVOCATION_TYPE_FIDO_SECURITY_KEY_FLOW;
            case 7:
                return INVOCATION_TYPE_FIDO_HYBRID_FLOW;
            case 8:
                return INVOCATION_TYPE_FIDO_TEST_PURPOSE;
            case 9:
                return INVOCATION_TYPE_MODULE_CREDMAN_PROVIDER;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
