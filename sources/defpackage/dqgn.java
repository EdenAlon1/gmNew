package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqgn extends ffhv implements ffji {
    int a;
    final /* synthetic */ dqgo b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqgn(dqgo dqgoVar, Uri uri, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dqgoVar;
        this.c = uri;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dqgo dqgoVar = this.b;
        Uri uri = this.c;
        this.a = 1;
        Object a = dqgoVar.a.a(uri, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqgn(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
