package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czgr {
    public final czgo a;
    public final ctwb b;
    public final ddzb c;
    public final bbfy d;
    public final elbx e;
    public final cxao f;
    public final ejlq g;
    public final int h;
    public final String i;
    public final boolean j;
    public final Context k;
    public final ejlr l = new a();
    public final bavz m;
    public final ctyw n;

    public czgr(czgo czgoVar, bavz bavzVar, ctwb ctwbVar, ctyw ctywVar, ddzb ddzbVar, bbfy bbfyVar, elbx elbxVar, cxao cxaoVar, ejlq ejlqVar, Context context, czgt czgtVar) {
        this.a = czgoVar;
        this.m = bavzVar;
        this.b = ctwbVar;
        this.n = ctywVar;
        this.c = ddzbVar;
        this.d = bbfyVar;
        this.f = cxaoVar;
        this.g = ejlqVar;
        this.k = context;
        this.e = elbxVar;
        this.h = czgtVar.c;
        this.i = czgtVar.d;
        this.j = czgtVar.e;
    }

    public static czgo a(int i, String str, boolean z) {
        czgs czgsVar = (czgs) czgt.a.createBuilder();
        czgsVar.copyOnWrite();
        czgt czgtVar = (czgt) czgsVar.instance;
        czgtVar.b |= 1;
        czgtVar.c = i;
        czgsVar.copyOnWrite();
        czgt czgtVar2 = (czgt) czgsVar.instance;
        czgtVar2.b |= 4;
        czgtVar2.e = z;
        if (str != null) {
            czgsVar.copyOnWrite();
            czgt czgtVar3 = (czgt) czgsVar.instance;
            czgtVar3.b |= 2;
            czgtVar3.d = str;
        }
        czgt czgtVar4 = (czgt) czgsVar.build();
        czgo czgoVar = new czgo();
        fbae.e(czgoVar);
        ekku.a(czgoVar, czgtVar4);
        return czgoVar;
    }

    public final void b(int i, boolean z) {
        if (z) {
            this.n.a(i).h(this.a.Y(R.string.stop_asking_sim_number_pref_key), true);
        }
    }

    /* compiled from: PG */
    final class a implements ejlr<Integer, Void> {
        public a() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            int intValue = ((Integer) obj).intValue();
            czgr czgrVar = czgr.this;
            czgrVar.m.b().K();
            czgrVar.d.a(intValue).t();
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            csjy.o("Bugle", "Failed to update MMS group phone number in SettingsStore for subId(%s). Throwable: %s", (Integer) obj, th);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
