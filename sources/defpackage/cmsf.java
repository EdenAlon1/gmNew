package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmsf extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ cmsg b;
    int c;
    MessageIdType d;
    cmrm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmsf(cmsg cmsgVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = cmsgVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, this);
    }
}
