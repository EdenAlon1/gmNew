package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eehr {
    public final String a;
    public int b;
    public String f;
    public final String g;
    public final String h;
    public ArrayList j;
    public eenk p;
    public eenl q;
    public eenh[] r;
    public eenh[] s;
    public eenh[] t;
    public String u;
    public String v;
    public eekj c = null;
    public final String d = eeja.a();
    public String e = null;
    public eenk i = null;
    public boolean k = true;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public String w = null;
    public boolean x = false;

    public eehr(String str, int i, String str2, String str3, String str4, ArrayList arrayList) {
        this.b = 1;
        this.a = str;
        this.b = i;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.j = arrayList;
    }

    public final void a() {
        this.b++;
    }

    public final synchronized void b() {
        this.n = true;
    }

    public final synchronized void c() {
        this.m = true;
    }

    public final synchronized void d() {
        this.o = true;
    }

    public final void e(String str) {
        if (str.startsWith("<")) {
            str = str.substring(1);
        }
        if (str.endsWith(">")) {
            str = str.substring(0, str.length() - 1);
        }
        this.u = str;
    }

    public final synchronized void f() {
        this.l = true;
    }

    public final eenh g() {
        eenh[] eenhVarArr = this.s;
        if (eenhVarArr != null) {
            for (int i = 0; i < eenhVarArr.length; i++) {
                if ("application/sdp".equals(eenhVarArr[i].b)) {
                    return eenhVarArr[i];
                }
            }
        }
        return null;
    }

    public final String toString() {
        return "SipDialogPath{callId='" + this.a + "', target='" + dktx.URI.c(this.f) + "', localParty='" + dktx.URI.c(this.g) + "', remoteParty='" + dktx.URI.c(this.h) + "'}";
    }
}
