package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class una extends ffhv implements ffjm {
    final /* synthetic */ une a;
    final /* synthetic */ Uri b;
    final /* synthetic */ ffla c;
    final /* synthetic */ ffla d;
    final /* synthetic */ ffla e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public una(ffgu ffguVar, une uneVar, Uri uri, ffla fflaVar, ffla fflaVar2, ffla fflaVar3) {
        super(2, ffguVar);
        this.a = uneVar;
        this.b = uri;
        this.c = fflaVar;
        this.d = fflaVar2;
        this.e = fflaVar3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((una) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        ffci.b(obj);
        Activity activity = this.a.a;
        ffla fflaVar = this.c;
        Uri uri = this.b;
        String m = csuu.m(activity, uri);
        fflaVar.a = csuu.a(activity, uri);
        String b = le.b(csuu.q(this.a.a, this.b));
        obj2 = this.a.b.get();
        this.d.a = ((Number) ((ugx) obj2).c.invoke()).longValue();
        obj3 = this.a.b.get();
        this.e.a = ((Number) ((ugx) obj3).b.invoke()).longValue();
        if (!((Boolean) cful.o.e()).booleanValue()) {
            return new FileContentItem(this.b, b, m, this.c.a);
        }
        Uri uri2 = this.b;
        ufh m2 = ufi.m();
        m2.e(uri2);
        m2.c(m);
        m2.d(this.c.a);
        m2.b(b);
        return m2.a();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        una unaVar = new una(ffguVar, this.a, this.b, this.c, this.d, this.e);
        unaVar.f = obj;
        return unaVar;
    }
}
