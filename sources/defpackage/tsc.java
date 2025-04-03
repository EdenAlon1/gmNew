package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsc {
    public static final cskc a = cskc.g("BugleCms", "ParticipantSync");
    public final crty b;
    public final ccqp c;
    public final errl d;
    public final errl e;

    public tsc(crty crtyVar, ccqp ccqpVar, errl errlVar, errl errlVar2) {
        this.b = crtyVar;
        this.c = ccqpVar;
        this.d = errlVar;
        this.e = errlVar2;
    }

    public final elfl a(final String str, final String str2) {
        return (elfl) ParticipantsTable.j(str, new Function() { // from class: tsa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                csjb d = tsc.a.d();
                d.A(cdii.t.a, str2);
                d.A(cdii.v.a, "Participant already in DB");
                d.A(cdii.w.a, str);
                d.I("Participant Sync");
                d.r();
                return elfo.e(null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Supplier() { // from class: tsb
            @Override // java.util.function.Supplier
            public final Object get() {
                final tsc tscVar = tsc.this;
                crty crtyVar = tscVar.b;
                final String str3 = str;
                elfl i = crtyVar.t(str3).i(new eroh() { // from class: trx
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return tsc.this.c.f((etah) obj, false);
                    }
                }, tscVar.e);
                final String str4 = str2;
                return i.h(new emwl() { // from class: try
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        csjb c = tsc.a.c();
                        c.A(cdii.t.a, str4);
                        c.A(cdii.v.a, "Created participant in DB");
                        c.A(cdii.w.a, str3);
                        c.I("Participant Sync");
                        c.r();
                        return null;
                    }
                }, tscVar.d).f(Throwable.class, new eroh() { // from class: trz
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        Throwable th = (Throwable) obj;
                        boolean equals = Status.c(th).getCode().equals(Status.Code.NOT_FOUND);
                        String str5 = str3;
                        String str6 = str4;
                        if (equals) {
                            csjb e = tsc.a.e();
                            e.A(cdii.t.a, str6);
                            e.A(cdii.v.a, "Ignore: Participant not found in CMS");
                            e.A(cdii.w.a, str5);
                            e.I("Participant Sync");
                            e.r();
                            return elfo.e(null);
                        }
                        csjb e2 = tsc.a.e();
                        e2.A(cdii.t.a, str6);
                        e2.A(cdii.v.a, "Exception while processing event");
                        e2.A(cdii.w.a, str5);
                        e2.I("Participant Sync");
                        e2.s(th);
                        return elfo.d(th);
                    }
                }, erpp.a);
            }
        });
    }
}
