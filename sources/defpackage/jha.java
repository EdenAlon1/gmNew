package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jha extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fflb b;
    final /* synthetic */ hjh c;
    final /* synthetic */ lkr d;
    final /* synthetic */ jhb e;
    final /* synthetic */ View f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jha(fflb fflbVar, hjh hjhVar, lkr lkrVar, jhb jhbVar, View view, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fflbVar;
        this.c = hjhVar;
        this.d = lkrVar;
        this.e = jhbVar;
        this.f = view;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jha) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [ffud] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffud ffudVar;
        ffud ffudVar2;
        fgdj fgdjVar;
        ffhh ffhhVar = ffhh.a;
        ?? r1 = this.a;
        try {
            if (r1 != 0) {
                ffudVar2 = (ffud) this.g;
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ffsk ffskVar = (ffsk) this.g;
                r1 = 0;
                r1 = 0;
                jfa jfaVar = (jfa) this.b.a;
                if (jfaVar != null) {
                    Context applicationContext = this.f.getContext().getApplicationContext();
                    synchronized (jhe.a) {
                        Map map = jhe.a;
                        Object obj2 = map.get(applicationContext);
                        Object obj3 = obj2;
                        if (obj2 == null) {
                            ContentResolver contentResolver = applicationContext.getContentResolver();
                            Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                            ffwm a = ffwp.a(-1, 0, 6);
                            fgcp fgcpVar = new fgcp(new jhc(contentResolver, uriFor, new jhd(a, kqv.a(Looper.getMainLooper())), a, applicationContext, null));
                            ffsk c = ffsl.c();
                            int i = fgcz.a;
                            fgdj b = fgbn.b(fgcpVar, c, fgcy.a(0L, 3), Float.valueOf(Settings.Global.getFloat(applicationContext.getContentResolver(), "animator_duration_scale", 1.0f)));
                            map.put(applicationContext, b);
                            obj3 = b;
                        }
                        fgdjVar = (fgdj) obj3;
                    }
                    jfaVar.b(((Number) fgdjVar.c()).floatValue());
                    ffudVar = ffqy.d(ffskVar, null, null, new jgz(fgdjVar, jfaVar, null), 3);
                } else {
                    ffudVar = null;
                }
                try {
                    hjh hjhVar = this.c;
                    this.g = ffudVar;
                    this.a = 1;
                    Object a2 = ffra.a(hjhVar.c, new hjd(hjhVar, new hjf(hjhVar, null), hhj.a(u()), null), this);
                    ffhh ffhhVar2 = ffhh.a;
                    Object obj4 = a2;
                    if (a2 != ffhhVar2) {
                        obj4 = ffcu.a;
                    }
                    if (obj4 != ffhhVar2) {
                        obj4 = ffcu.a;
                    }
                    if (obj4 == ffhhVar) {
                        return ffhhVar;
                    }
                    ffudVar2 = ffudVar;
                } catch (Throwable th) {
                    th = th;
                    r1 = ffudVar;
                    Throwable th2 = th;
                    if (r1 != 0) {
                        r1.t(null);
                    }
                    this.d.P().d(this.e);
                    throw th2;
                }
            }
            if (ffudVar2 != null) {
                ffudVar2.t(null);
            }
            this.d.P().d(this.e);
            return ffcu.a;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        jha jhaVar = new jha(this.b, this.c, this.d, this.e, this.f, ffguVar);
        jhaVar.g = obj;
        return jhaVar;
    }
}
