package org.chromium.support_lib_boundary;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z);

    void setAllowFileAccess(boolean z);

    void setBlockNetworkLoads(boolean z);

    void setCacheMode(int i);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
