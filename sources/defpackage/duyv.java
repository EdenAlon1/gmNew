package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duyv implements SharedPreferences.Editor {
    private final Context a;
    private final String b;
    private final ArrayList c = new ArrayList();
    private boolean d = false;

    public duyv(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final synchronized void a() {
        this.c.clear();
        this.d = true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        erqt.m(new Callable() { // from class: duyu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(duyv.this.commit());
            }
        }, dunl.a().e);
    }

    public final synchronized void b(String str, boolean z) {
        duza duzaVar = (duza) duzc.a.createBuilder();
        duzaVar.copyOnWrite();
        duzc duzcVar = (duzc) duzaVar.instance;
        str.getClass();
        duzcVar.b |= 1;
        duzcVar.e = str;
        duzaVar.copyOnWrite();
        duzc duzcVar2 = (duzc) duzaVar.instance;
        duzcVar2.c = 2;
        duzcVar2.d = Boolean.valueOf(z);
        this.c.add((duzc) duzaVar.build());
    }

    public final synchronized void c(String str, float f) {
        duza duzaVar = (duza) duzc.a.createBuilder();
        duzaVar.copyOnWrite();
        duzc duzcVar = (duzc) duzaVar.instance;
        str.getClass();
        duzcVar.b |= 1;
        duzcVar.e = str;
        duzaVar.copyOnWrite();
        duzc duzcVar2 = (duzc) duzaVar.instance;
        duzcVar2.c = 5;
        duzcVar2.d = Float.valueOf(f);
        this.c.add((duzc) duzaVar.build());
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor clear() {
        a();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010f A[RETURN] */
    @Override // android.content.SharedPreferences.Editor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean commit() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duyv.commit():boolean");
    }

    public final synchronized void d(String str, int i) {
        duza duzaVar = (duza) duzc.a.createBuilder();
        duzaVar.copyOnWrite();
        duzc duzcVar = (duzc) duzaVar.instance;
        str.getClass();
        duzcVar.b |= 1;
        duzcVar.e = str;
        duzaVar.copyOnWrite();
        duzc duzcVar2 = (duzc) duzaVar.instance;
        duzcVar2.c = 3;
        duzcVar2.d = Integer.valueOf(i);
        this.c.add((duzc) duzaVar.build());
    }

    public final synchronized void e(String str, long j) {
        duza duzaVar = (duza) duzc.a.createBuilder();
        duzaVar.copyOnWrite();
        duzc duzcVar = (duzc) duzaVar.instance;
        str.getClass();
        duzcVar.b |= 1;
        duzcVar.e = str;
        duzaVar.copyOnWrite();
        duzc duzcVar2 = (duzc) duzaVar.instance;
        duzcVar2.c = 4;
        duzcVar2.d = Long.valueOf(j);
        this.c.add((duzc) duzaVar.build());
    }

    public final synchronized void f(String str) {
        duza duzaVar = (duza) duzc.a.createBuilder();
        duzaVar.copyOnWrite();
        duzc duzcVar = (duzc) duzaVar.instance;
        str.getClass();
        duzcVar.b |= 1;
        duzcVar.e = str;
        this.c.add((duzc) duzaVar.build());
    }

    public final synchronized void g(String str, String str2) {
        if (str2 == null) {
            f(str);
            return;
        }
        ArrayList arrayList = this.c;
        duza duzaVar = (duza) duzc.a.createBuilder();
        duzaVar.copyOnWrite();
        duzc duzcVar = (duzc) duzaVar.instance;
        str.getClass();
        duzcVar.b |= 1;
        duzcVar.e = str;
        duzaVar.copyOnWrite();
        duzc duzcVar2 = (duzc) duzaVar.instance;
        duzcVar2.c = 6;
        duzcVar2.d = str2;
        arrayList.add((duzc) duzaVar.build());
    }

    public final synchronized void h(String str, Set set) {
        if (set == null) {
            f(str);
            return;
        }
        ArrayList arrayList = this.c;
        duza duzaVar = (duza) duzc.a.createBuilder();
        duzaVar.copyOnWrite();
        duzc duzcVar = (duzc) duzaVar.instance;
        str.getClass();
        duzcVar.b |= 1;
        duzcVar.e = str;
        duzp duzpVar = (duzp) duzq.a.createBuilder();
        duzpVar.copyOnWrite();
        duzq duzqVar = (duzq) duzpVar.instance;
        eygr eygrVar = duzqVar.b;
        if (!eygrVar.c()) {
            duzqVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(set, duzqVar.b);
        duzaVar.copyOnWrite();
        duzc duzcVar2 = (duzc) duzaVar.instance;
        duzq duzqVar2 = (duzq) duzpVar.build();
        duzqVar2.getClass();
        duzcVar2.d = duzqVar2;
        duzcVar2.c = 7;
        arrayList.add((duzc) duzaVar.build());
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
        b(str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putFloat(String str, float f) {
        c(str, f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putInt(String str, int i) {
        d(str, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putLong(String str, long j) {
        e(str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
        g(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
        h(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor remove(String str) {
        f(str);
        return this;
    }
}
