package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drqe extends ffhv implements ffji {
    int a;
    final /* synthetic */ drqi b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drqe(drqi drqiVar, Uri uri, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = drqiVar;
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
        drqi drqiVar = this.b;
        Uri uri = this.c;
        this.a = 1;
        Object a = drqiVar.b.a(uri, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new drqe(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
