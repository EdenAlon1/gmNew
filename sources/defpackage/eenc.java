package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eenc extends eemm {
    @Override // defpackage.eemm
    public final eeku b() {
        eejc eejcVar;
        String str;
        eelp eelpVar = new eelp();
        this.a.a(2064);
        this.a.h();
        this.a.a(58);
        this.a.h();
        do {
            eelo eeloVar = new eelo();
            this.a.a(4095);
            eejb eejbVar = this.a;
            eejj eejjVar = eejbVar.e;
            eejbVar.h();
            this.a.a(47);
            this.a.h();
            this.a.a(4095);
            this.a.h();
            eejb eejbVar2 = this.a;
            eejj eejjVar2 = eejbVar2.e;
            eejbVar2.h();
            this.a.a(47);
            this.a.h();
            this.a.a(4095);
            this.a.h();
            eejb eejbVar3 = this.a;
            eejj eejjVar3 = eejbVar3.e;
            eejbVar3.h();
            eela eelaVar = new eela();
            eelaVar.a = eejjVar.a;
            eelaVar.b = eejjVar2.a;
            eelaVar.c = eejjVar3.a;
            eeloVar.a = eelaVar;
            eejb eejbVar4 = this.a;
            eejf eejfVar = new eejf();
            eejfVar.a = eejbVar4;
            eejbVar4.j("charLexer");
            eeloVar.b = eeiy.a(eejfVar);
            this.a.h();
            while (true) {
                boolean z = false;
                if (this.a.o(0) != ';') {
                    break;
                }
                this.a.a(59);
                this.a.h();
                this.a.a(4095);
                eejb eejbVar5 = this.a;
                eejj eejjVar4 = eejbVar5.e;
                eejbVar5.h();
                try {
                    if (this.a.o(0) == '=') {
                        this.a.q(1);
                        this.a.h();
                        if (eejjVar4.a.compareToIgnoreCase("received") == 0) {
                            eejb eejbVar6 = this.a;
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                try {
                                    char o = eejbVar6.o(0);
                                    if (o == '\n' || o == ';') {
                                        break;
                                    }
                                    eejbVar6.q(1);
                                    sb.append(o);
                                } catch (eeje unused) {
                                    str = sb.toString();
                                }
                            }
                            str = sb.toString();
                        } else if (this.a.o(0) == '\"') {
                            str = this.a.e();
                            z = true;
                        } else {
                            this.a.a(4095);
                            str = this.a.e.a;
                        }
                        eejcVar = new eejc(eejjVar4.a.toLowerCase(), str);
                        if (z) {
                            eejcVar.b();
                        }
                    } else {
                        eejcVar = new eejc(eejjVar4.a.toLowerCase(), null);
                    }
                } catch (eeje unused2) {
                    eejcVar = new eejc(eejjVar4.a, null);
                }
                eejcVar.d = eejcVar.a().toLowerCase(Locale.US);
                eeloVar.j(eejcVar);
                this.a.h();
            }
            if (this.a.o(0) == '(') {
                this.a.j("charLexer");
                this.a.q(1);
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    char o2 = this.a.o(0);
                    if (o2 != ')') {
                        if (o2 != '\\') {
                            if (o2 == '\n') {
                                break;
                            }
                            stringBuffer.append(o2);
                            this.a.q(1);
                        } else {
                            stringBuffer.append(this.a.e.a);
                            this.a.q(1);
                            stringBuffer.append(this.a.e.a);
                            this.a.q(1);
                        }
                    } else {
                        this.a.q(1);
                        break;
                    }
                }
                eeloVar.f = stringBuffer.toString();
            }
            eelpVar.g(eeloVar);
            this.a.h();
            if (this.a.o(0) == ',') {
                this.a.q(1);
                this.a.h();
            }
        } while (this.a.o(0) != '\n');
        this.a.a(10);
        return eelpVar;
    }
}
