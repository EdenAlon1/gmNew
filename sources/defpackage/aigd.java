package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aigd implements aifx {
    public final Context a;
    public final aigz b;
    public final aicd c;
    public final ffbr d;
    public final fgcm e;
    public final dlsr f;
    private final ffsk g;
    private final dotb h;
    private final aigf i;
    private final fgdj j;

    public aigd(Context context, ffsk ffskVar, aigz aigzVar, aicd aicdVar, ffbr ffbrVar, aicu aicuVar, aidw aidwVar) {
        context.getClass();
        ffskVar.getClass();
        aigzVar.getClass();
        aicdVar.getClass();
        ffbrVar.getClass();
        aicuVar.getClass();
        aidwVar.getClass();
        this.a = context;
        this.g = ffskVar;
        this.b = aigzVar;
        this.c = aicdVar;
        this.d = ffbrVar;
        fgcm a = fgdm.a(false);
        this.e = a;
        String string = context.getString(R.string.search_action);
        string.getClass();
        dlsr dlsrVar = new dlsr(string, dmzz.dj, false, false, true, false, null, false, null, new ffix() { // from class: aify
            @Override // defpackage.ffix
            public final Object invoke() {
                aigd aigdVar = aigd.this;
                aifv.d((aifv) aigdVar.d.b(), 9, 0, 0, 6);
                aigdVar.e.f(true);
                return ffcu.a;
            }
        }, 996);
        this.f = dlsrVar;
        List b = ffdx.b(dlsrVar);
        dlsr b2 = b();
        String string2 = context.getString(R.string.multi_share_top_app_bar_title);
        string2.getClass();
        dotb dotbVar = new dotb(new dosk(string2, null, null, false, null, null, null, 254), b2, b, false, false, null, null, 112);
        this.h = dotbVar;
        aigf aigfVar = new aigf(dotbVar, new aidv(null), ffel.a, new aige(null));
        this.i = aigfVar;
        ffxx b3 = fgck.b(aicdVar.b(), aicuVar.a, aidwVar.a(), a, new aigc(this, null));
        int i = fgcz.a;
        this.j = fgbn.b(b3, ffskVar, fgcy.a(0L, 3), aigfVar);
    }

    @Override // defpackage.aifx
    public final fgdj a() {
        return this.j;
    }

    public final dlsr b() {
        Context context = this.a;
        dmzz dmzzVar = dmzz.p;
        String string = context.getString(R.string.multi_share_top_app_bar_back);
        string.getClass();
        return new dlsr(string, dmzzVar, false, false, false, false, null, false, null, new ffix() { // from class: aiga
            @Override // defpackage.ffix
            public final Object invoke() {
                aigd aigdVar = aigd.this;
                aifv.d((aifv) aigdVar.d.b(), 11, 0, 0, 6);
                if (((Boolean) aigdVar.e.c()).booleanValue()) {
                    aigdVar.c.c();
                    aigdVar.e.f(false);
                } else {
                    aigdVar.b.h(aijc.a);
                }
                return ffcu.a;
            }
        }, 1020);
    }
}
