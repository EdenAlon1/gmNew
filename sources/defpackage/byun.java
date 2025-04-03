package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class byun extends dtrr {
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Uri f;
    public String g;

    public byun() {
        super(byvy.b().P());
    }

    public final byul a() {
        byum byumVar = new byum();
        byumVar.aC(aB());
        byumVar.a = this.a;
        byumVar.b = this.b;
        byumVar.c = this.c;
        byumVar.d = this.d;
        byumVar.e = this.e;
        byumVar.f = this.f;
        byumVar.g = this.g;
        byumVar.cK = aC();
        return byumVar;
    }

    public final void b(String str) {
        aE(1);
        this.b = str;
    }

    public final void c(String str) {
        aE(3);
        this.d = str;
    }

    public final void d(long j) {
        aE(0);
        this.a = j;
    }

    public final void e(Uri uri) {
        aE(5);
        this.f = uri;
    }

    public final void f(String str) {
        aE(4);
        this.e = str;
    }

    public final void g(String str) {
        aE(2);
        this.c = str;
    }

    public final void h(String str) {
        aE(6);
        this.g = str;
    }
}
