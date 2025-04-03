package org.chromium.support_lib_boundary;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface WebViewStartUpResultBoundaryInterface {
    List<Throwable> getBlockingStartUpLocations();

    Long getMaxTimePerTaskInUiThreadMillis();

    Long getTotalTimeInUiThreadMillis();
}
