package org.chromium.support_lib_boundary;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface NoVarySearchDataBoundaryInterface {
    List<String> getConsideredQueryParameters();

    boolean getIgnoreDifferencesInParameters();

    List<String> getIgnoredQueryParameters();

    boolean getVaryOnKeyOrder();
}
