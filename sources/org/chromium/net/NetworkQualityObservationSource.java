package org.chromium.net;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PG */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface NetworkQualityObservationSource {
    public static final int DEFAULT_HTTP_FROM_PLATFORM = 4;
    public static final int DEFAULT_TRANSPORT_FROM_PLATFORM = 7;
    public static final int DEPRECATED_HTTP_EXTERNAL_ESTIMATE = 5;
    public static final int H2_PINGS = 8;
    public static final int HTTP = 0;
    public static final int HTTP_CACHED_ESTIMATE = 3;
    public static final int MAX = 9;
    public static final int QUIC = 2;
    public static final int TCP = 1;
    public static final int TRANSPORT_CACHED_ESTIMATE = 6;
}
