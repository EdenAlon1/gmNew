package org.chromium.net;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ApiVersion {
    private static final int API_LEVEL = 34;
    private static final String CRONET_VERSION = "133.0.6876.3";
    private static final String LAST_CHANGE = "faf69aeea3c7ebdaa7a976f27a47a17b0c3ef2b3-refs/branch-heads/6876@{#5}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "133.0.6876.3@".concat("faf69aee");
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 34;
    }
}
