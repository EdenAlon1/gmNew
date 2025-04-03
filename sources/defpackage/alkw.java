package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.StringJoiner;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alkw implements cfzm {
    public static final cskc a = cskc.g("Bugle", "RecentMessageCodesService");
    public final comc b;
    private final errl c;

    public alkw(comc comcVar, errl errlVar) {
        this.b = comcVar;
        this.c = errlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static enhk a(alko alkoVar) {
        String str;
        Optional empty;
        String a2;
        char c;
        enhd enhdVar = new enhd();
        enhdVar.k("last_outgoing_sms_error_code", (alkoVar.b & 1) != 0 ? String.valueOf(alkoVar.c) : "None");
        enhdVar.k("last_outgoing_sms_result_code", (alkoVar.b & 2) != 0 ? String.valueOf(alkoVar.d) : "None");
        enhdVar.k("last_outgoing_mms_result_code", (alkoVar.b & 4) != 0 ? String.valueOf(alkoVar.e) : "None");
        enhdVar.k("last_mms_connection_failure_code", (alkoVar.b & 32) != 0 ? String.valueOf(alkoVar.i) : "None");
        enhdVar.k("last_outgoing_rcs_result_code", (alkoVar.b & 8) != 0 ? String.valueOf(alkoVar.f) : "None");
        if ((alkoVar.b & 16) != 0) {
            int a3 = eyqv.a(alkoVar.g);
            if (a3 == 0) {
                a3 = 1;
            }
            str = String.valueOf(a3 - 1);
        } else {
            str = "None";
        }
        enhdVar.k("last_outgoing_chat_session_event_info", str);
        Iterator it = enkr.f(alkoVar.h).iterator();
        while (true) {
            if (!it.hasNext()) {
                empty = Optional.empty();
                break;
            }
            alkg alkgVar = (alkg) it.next();
            int b = eoom.b(alkgVar.c);
            if (b != 0 && b == 3 && !g(alkgVar)) {
                empty = Optional.of(Integer.valueOf(alkgVar.g));
                break;
            }
        }
        enhdVar.k("last_mms_download_result_code", (String) empty.map(new Function() { // from class: alkr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf((Integer) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("None"));
        if ((alkoVar.b & 64) != 0) {
            enhdVar.k("last_outgoing_slm_result_code", String.valueOf(alkoVar.j));
        }
        if (alkoVar.h.size() > 0) {
            StringJoiner stringJoiner = new StringJoiner("\n");
            eygr eygrVar = alkoVar.h;
            for (int i = 0; i < eygrVar.size(); i++) {
                StringJoiner stringJoiner2 = new StringJoiner(", ", "{ ", " }");
                alkg alkgVar2 = (alkg) eygrVar.get(i);
                StringBuilder sb = new StringBuilder();
                sb.append("type: ");
                if (g(alkgVar2)) {
                    int b2 = eoom.b(alkgVar2.c);
                    if (b2 == 0) {
                        b2 = 1;
                    }
                    a2 = eoom.a(b2).concat("_SLM");
                } else {
                    int b3 = eoom.b(alkgVar2.c);
                    if (b3 == 0) {
                        b3 = 1;
                    }
                    a2 = eoom.a(b3);
                }
                sb.append(a2);
                StringJoiner add = stringJoiner2.add(sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("message_id: ");
                eoqb eoqbVar = alkgVar2.d;
                if (eoqbVar == null) {
                    eoqbVar = eoqb.a;
                }
                sb2.append(eoqbVar.c);
                StringJoiner add2 = add.add(sb2).add("x_message_id: " + alkgVar2.n);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("message_status: ");
                sb3.append(alkgVar2.e);
                StringJoiner add3 = add2.add(sb3);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("result_code: ");
                sb4.append(alkgVar2.g);
                add3.add(sb4).add("conversation_type: " + alkgVar2.o);
                int b4 = eoom.b(alkgVar2.c);
                if (b4 == 0) {
                    b4 = 1;
                }
                int i2 = b4 - 1;
                if (i2 == 1) {
                    c = 3;
                    if (!g(alkgVar2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("sms_error_code: ");
                        sb5.append(alkgVar2.f);
                        stringJoiner2.add(sb5);
                    }
                } else if (i2 != 2) {
                    c = 3;
                    if (i2 == 3) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("rcs_message_id: ");
                        eoqb eoqbVar2 = alkgVar2.d;
                        if (eoqbVar2 == null) {
                            eoqbVar2 = eoqb.a;
                        }
                        sb6.append(eoqbVar2.d);
                        StringJoiner add4 = stringJoiner2.add(sb6);
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("chat_session_event_info: ");
                        int a4 = eyqv.a(alkgVar2.h);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        sb7.append(a4 - 1);
                        add4.add(sb7);
                    }
                } else {
                    c = 3;
                    if (!g(alkgVar2)) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("last_mms_connection_failure_code: ");
                        sb8.append(alkgVar2.i);
                        stringJoiner2.add(sb8);
                    }
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append("retry: ");
                sb9.append(alkgVar2.j);
                sb9.append("/");
                sb9.append(alkgVar2.k);
                stringJoiner2.add(sb9);
                alkj alkjVar = alkgVar2.l;
                if (alkjVar == null) {
                    alkjVar = alkj.b;
                }
                StringJoiner stringJoiner3 = new StringJoiner(", ", "{ ", " }");
                StringBuilder sb10 = new StringBuilder();
                sb10.append("airplaneMode: ");
                sb10.append(alkjVar.d);
                StringJoiner add5 = stringJoiner3.add(sb10);
                StringBuilder sb11 = new StringBuilder();
                sb11.append("mobileData: ");
                sb11.append(alkjVar.e);
                StringJoiner add6 = add5.add(sb11);
                StringBuilder sb12 = new StringBuilder();
                sb12.append("signalStrength: ");
                sb12.append(alkjVar.f);
                StringJoiner add7 = add6.add(sb12);
                StringBuilder sb13 = new StringBuilder();
                sb13.append("networkTransport: ");
                sb13.append(Arrays.toString(Collection.EL.stream(new eygk(alkjVar.g, alkj.a)).map(new Function() { // from class: alkv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((alkl) obj).name();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).toArray()));
                add7.add(sb13);
                StringBuilder sb14 = new StringBuilder();
                sb14.append("network_conditions: ");
                sb14.append(stringJoiner3);
                stringJoiner2.add(sb14);
                stringJoiner.add(stringJoiner2.toString());
            }
            enhdVar.k("last_messages_codes", stringJoiner.toString());
        }
        return enhdVar.c();
    }

    public static boolean g(alkg alkgVar) {
        eopp b = eopp.b(alkgVar.m);
        if (b == null) {
            b = eopp.UNSPECIFIED;
        }
        return b.equals(eopp.SLM);
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl c() {
        return cfzj.c();
    }

    @Override // defpackage.cfzm
    public final elfl d() {
        return this.b.h().i(new eroh() { // from class: alks
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return elfo.e(alkw.a((alko) obj));
            }
        }, this.c).h(new emwl() { // from class: alkt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return cfzj.a((Map) obj);
            }
        }, this.c);
    }

    public final void e(alkg alkgVar) {
        f(alkgVar, false);
    }

    public final void f(final alkg alkgVar, final boolean z) {
        this.b.m(new emwl() { // from class: alkq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                alko alkoVar = (alko) obj;
                alkn alknVar = (alkn) alkoVar.toBuilder();
                alkg alkgVar2 = alkgVar;
                if (z) {
                    int b = eoom.b(alkgVar2.c);
                    if (b == 0) {
                        b = 1;
                    }
                    int i = b - 1;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                int i2 = alkgVar2.g;
                                alknVar.copyOnWrite();
                                alko alkoVar2 = (alko) alknVar.instance;
                                alkoVar2.b |= 8;
                                alkoVar2.f = i2;
                                if ((alkgVar2.b & 32) != 0) {
                                    int a2 = eyqv.a(alkgVar2.h);
                                    int i3 = a2 != 0 ? a2 : 1;
                                    alknVar.copyOnWrite();
                                    alko alkoVar3 = (alko) alknVar.instance;
                                    alkoVar3.g = i3 - 1;
                                    alkoVar3.b |= 16;
                                }
                            }
                        } else if (alkw.g(alkgVar2)) {
                            int i4 = alkgVar2.g;
                            alknVar.copyOnWrite();
                            alko alkoVar4 = (alko) alknVar.instance;
                            alkoVar4.b |= 64;
                            alkoVar4.j = i4;
                        } else {
                            int i5 = alkgVar2.g;
                            alknVar.copyOnWrite();
                            alko alkoVar5 = (alko) alknVar.instance;
                            alkoVar5.b |= 4;
                            alkoVar5.e = i5;
                            int i6 = alkgVar2.i;
                            alknVar.copyOnWrite();
                            alko alkoVar6 = (alko) alknVar.instance;
                            alkoVar6.b |= 32;
                            alkoVar6.i = i6;
                        }
                    } else if (alkw.g(alkgVar2)) {
                        int i7 = alkgVar2.g;
                        alknVar.copyOnWrite();
                        alko alkoVar7 = (alko) alknVar.instance;
                        alkoVar7.b |= 64;
                        alkoVar7.j = i7;
                    } else {
                        int i8 = alkgVar2.f;
                        alknVar.copyOnWrite();
                        alko alkoVar8 = (alko) alknVar.instance;
                        alkoVar8.b = 1 | alkoVar8.b;
                        alkoVar8.c = i8;
                        int i9 = alkgVar2.g;
                        alknVar.copyOnWrite();
                        alko alkoVar9 = (alko) alknVar.instance;
                        alkoVar9.b = 2 | alkoVar9.b;
                        alkoVar9.d = i9;
                    }
                }
                if (alkoVar.h.size() == 10) {
                    alknVar.copyOnWrite();
                    alko alkoVar10 = (alko) alknVar.instance;
                    alkoVar10.a();
                    alkoVar10.h.remove(0);
                }
                alknVar.copyOnWrite();
                alko alkoVar11 = (alko) alknVar.instance;
                alkgVar2.getClass();
                alkoVar11.a();
                alkoVar11.h.add(alkgVar2);
                return (alko) alknVar.build();
            }
        });
    }
}
