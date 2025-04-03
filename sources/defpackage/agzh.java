package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agzh {
    public static agzg g() {
        afcq afcqVar = new afcq();
        afcqVar.f(-1L);
        afcqVar.a = bdgq.a;
        afcqVar.b(false);
        afcqVar.d(-1);
        ctsw createBuilder = ctsx.a.createBuilder();
        createBuilder.copyOnWrite();
        ctsx ctsxVar = (ctsx) createBuilder.instance;
        ctsxVar.b |= 1;
        ctsxVar.c = false;
        createBuilder.copyOnWrite();
        ctsx.a((ctsx) createBuilder.instance);
        afcqVar.e(createBuilder.build());
        afcqVar.c(false);
        return afcqVar;
    }

    public abstract int a();

    public abstract long b();

    public abstract ConversationIdType c();

    public abstract ctsx d();

    public abstract boolean e();

    public abstract boolean f();
}
