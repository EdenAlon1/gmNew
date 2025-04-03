package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaka implements eajx {
    public final eagn a;
    public final eaki b;
    public final eaox c;
    public final easc d;
    public eagt e;
    public String f;
    public String g;
    public String h;
    public exrt i;
    public long k;
    public String l;
    public String m;
    public Long n;
    public String o;
    public final int q;
    public final int r;
    public final int s;
    public int t;
    public int u;
    public final List j = new ArrayList();
    public Set p = ffen.a;

    public eaka(dlpw dlpwVar, int i, int i2, int i3, eagn eagnVar, eaki eakiVar, eaox eaoxVar, easc eascVar) {
        this.q = i;
        this.r = i2;
        this.s = i3;
        this.a = eagnVar;
        this.b = eakiVar;
        this.c = eaoxVar;
        this.d = eascVar;
        this.k = TimeUnit.MILLISECONDS.toMicros(dlpwVar.f().toEpochMilli());
    }

    @Override // defpackage.eajx
    public final /* bridge */ /* synthetic */ void a(exrt exrtVar) {
        exrtVar.getClass();
        this.i = exrtVar;
    }

    @Override // defpackage.eajx
    public final /* bridge */ /* synthetic */ void b(eagt eagtVar) {
        if (eagtVar != null) {
            this.e = eagtVar;
            easy s = eagtVar.s();
            if (s instanceof eatf) {
                this.f = eagtVar.n();
                this.o = ((eatf) s).a;
            } else if (s instanceof eatb) {
                this.o = eagtVar.k();
                this.g = ((eatb) s).a;
                this.h = eagtVar.l();
            } else if (s instanceof eatd) {
                this.n = Long.valueOf(eagtVar.d());
            }
        }
    }

    @Override // defpackage.eajx
    public final /* bridge */ /* synthetic */ void c(exxk exxkVar) {
        exxkVar.getClass();
        String str = exxkVar.e;
        str.getClass();
        if (str.length() > 0) {
            List list = this.j;
            exqv exqvVar = (exqv) exqw.a.createBuilder();
            exqvVar.getClass();
            String str2 = exxkVar.e;
            str2.getClass();
            exqvVar.copyOnWrite();
            exqw exqwVar = (exqw) exqvVar.instance;
            exqwVar.b |= 1;
            exqwVar.c = str2;
            long j = exxkVar.g;
            exqvVar.copyOnWrite();
            exqw exqwVar2 = (exqw) exqvVar.instance;
            exqwVar2.b |= 2;
            exqwVar2.d = j;
            long j2 = exxkVar.f;
            exqvVar.copyOnWrite();
            exqw exqwVar3 = (exqw) exqvVar.instance;
            exqwVar3.b |= 4;
            exqwVar3.e = j2;
            String str3 = (exxkVar.c == 12 ? (exwr) exxkVar.d : exwr.a).b;
            str3.getClass();
            exqvVar.copyOnWrite();
            exqw exqwVar4 = (exqw) exqvVar.instance;
            exqwVar4.b |= 8;
            exqwVar4.f = str3;
            exwq exwqVar = (exxkVar.c == 12 ? (exwr) exxkVar.d : exwr.a).c;
            if (exwqVar == null) {
                exwqVar = exwq.a;
            }
            String str4 = exwqVar.b;
            str4.getClass();
            exqvVar.copyOnWrite();
            exqw exqwVar5 = (exqw) exqvVar.instance;
            exqwVar5.b |= 16;
            exqwVar5.g = str4;
            eyee eyeeVar = exxkVar.j;
            eyeeVar.getClass();
            exqvVar.copyOnWrite();
            exqw exqwVar6 = (exqw) exqvVar.instance;
            exqwVar6.b |= 128;
            exqwVar6.h = eyeeVar;
            eyfy build = exqvVar.build();
            build.getClass();
            list.add((exqw) build);
        }
        Set set = this.p;
        eygi eygiVar = exxkVar.k;
        eygiVar.getClass();
        this.p = fffi.g(set, ffdx.ar(eygiVar));
    }
}
