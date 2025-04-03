package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface WebViewStartUpConfigBoundaryInterface {
    Executor getBackgroundExecutor();

    boolean shouldRunUiThreadStartUpTasks();
}
