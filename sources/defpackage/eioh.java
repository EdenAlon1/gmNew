package defpackage;

import com.google.android.setupcompat.ISetupCompatService;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eioh {
    final ISetupCompatService a;
    final int b;

    public eioh(int i) {
        this(i, null);
    }

    public eioh(int i, ISetupCompatService iSetupCompatService) {
        this.b = i;
        this.a = iSetupCompatService;
        if (i == 4) {
            eioc.c(iSetupCompatService, "CompatService cannot be null when state is connected");
        }
    }
}
