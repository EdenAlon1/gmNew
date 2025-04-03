package defpackage;

import android.content.Context;
import android.telephony.ims.RcsContactUceCapability;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diid {
    static final diyy a;
    static final diyy b;
    public static final /* synthetic */ int c = 0;
    private static final engw d;
    private final Context e;
    private final dikt f;

    static {
        int i = engw.d;
        d = enou.a;
        a = diyv.b("enable_tuple_info_logging_for_request_availability_api");
        b = diyv.b("enable_tuple_info_logging_for_request_capability_api");
    }

    public diid(Context context, dikt diktVar) {
        this.e = context;
        this.f = diktVar;
    }

    private final void d(eyvv eyvvVar) {
        this.f.h(this.e, eyvvVar);
    }

    public final void a(long j, int i, int i2, long j2) {
        eywk eywkVar = (eywk) eywr.a.createBuilder();
        eywkVar.copyOnWrite();
        eywr eywrVar = (eywr) eywkVar.instance;
        eywrVar.b |= 2;
        eywrVar.d = i2;
        if (j2 > 0) {
            eywkVar.copyOnWrite();
            eywr eywrVar2 = (eywr) eywkVar.instance;
            eywrVar2.b |= 4;
            eywrVar2.e = j2;
        }
        eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
        eyvuVar.copyOnWrite();
        eyvv eyvvVar = (eyvv) eyvuVar.instance;
        eyvvVar.b |= 1;
        eyvvVar.e = j;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
        eyvvVar2.f = i - 1;
        eyvvVar2.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
        eyvvVar3.g = 3;
        eyvvVar3.b |= 4;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar4 = (eyvv) eyvuVar.instance;
        eywr eywrVar3 = (eywr) eywkVar.build();
        eywrVar3.getClass();
        eyvvVar4.d = eywrVar3;
        eyvvVar4.c = 3;
        d((eyvv) eyvuVar.build());
    }

    public final void b(long j, int i) {
        eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
        eyvuVar.copyOnWrite();
        eyvv eyvvVar = (eyvv) eyvuVar.instance;
        eyvvVar.b |= 1;
        eyvvVar.e = j;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
        eyvvVar2.f = i - 1;
        eyvvVar2.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
        eyvvVar3.g = 1;
        eyvvVar3.b |= 4;
        d((eyvv) eyvuVar.build());
    }

    public final void c(long j, int i, List list) {
        boolean z = (i == 2 && ((Boolean) b.a()).booleanValue()) || (i == 3 && ((Boolean) a.a()).booleanValue());
        RcsContactUceCapability rcsContactUceCapability = (RcsContactUceCapability) list.get(0);
        rcsContactUceCapability.getClass();
        int i2 = rcsContactUceCapability.getSourceType() == 1 ? 3 : 2;
        eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
        eyvuVar.copyOnWrite();
        eyvv eyvvVar = (eyvv) eyvuVar.instance;
        eyvvVar.b |= 1;
        eyvvVar.e = j;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
        eyvvVar2.f = i - 1;
        eyvvVar2.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
        eyvvVar3.g = 2;
        eyvvVar3.b |= 4;
        eywk eywkVar = (eywk) eywr.a.createBuilder();
        eywkVar.copyOnWrite();
        eywr eywrVar = (eywr) eywkVar.instance;
        eywrVar.c = i2 - 1;
        eywrVar.b |= 1;
        Iterable iterable = z ? (List) Collection.EL.stream(rcsContactUceCapability.getCapabilityTuples()).map(new Function() { // from class: diic
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
            
                if (r2.equals("org.3gpp.urn:urn-7:3gpp-application.ims.iari.rcse.dp") != false) goto L69;
             */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r21) {
                /*
                    Method dump skipped, instructions count: 464
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.diic.apply(java.lang.Object):java.lang.Object");
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList()) : d;
        eywkVar.copyOnWrite();
        eywr eywrVar2 = (eywr) eywkVar.instance;
        eygr eygrVar = eywrVar2.f;
        if (!eygrVar.c()) {
            eywrVar2.f = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, eywrVar2.f);
        eywr eywrVar3 = (eywr) eywkVar.build();
        eyvuVar.copyOnWrite();
        eyvv eyvvVar4 = (eyvv) eyvuVar.instance;
        eywrVar3.getClass();
        eyvvVar4.d = eywrVar3;
        eyvvVar4.c = 3;
        d((eyvv) eyvuVar.build());
    }
}
