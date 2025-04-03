package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crrm {
    public static final entd a = entd.c("Bugle");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final crqw e;
    public final ffbr f;
    public final croc g;
    public final cbgf h;
    public final dtuu i;
    public final ffbr j;
    public final ffbr k;
    public final ffsk l;
    public final ffbr m;
    private final ffbr n;

    public crrm(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, crqw crqwVar, ffbr ffbrVar5, croc crocVar, cbgf cbgfVar, ffbr ffbrVar6, dtuu dtuuVar, ffbr ffbrVar7, ffbr ffbrVar8, ffsk ffskVar, ffbr ffbrVar9) {
        context.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        crqwVar.getClass();
        ffbrVar5.getClass();
        crocVar.getClass();
        cbgfVar.getClass();
        ffbrVar6.getClass();
        dtuuVar.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffskVar.getClass();
        ffbrVar9.getClass();
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = crqwVar;
        this.f = ffbrVar5;
        this.g = crocVar;
        this.h = cbgfVar;
        this.n = ffbrVar6;
        this.i = dtuuVar;
        this.j = ffbrVar7;
        this.k = ffbrVar8;
        this.l = ffskVar;
        this.m = ffbrVar9;
    }

    public static final Boolean g(String str) {
        ekzz f = eleg.f("DestinationBlocker#isBlockedDestinationInBugleDb");
        try {
            String[] strArr = ParticipantsTable.a;
            bvvw bvvwVar = new bvvw();
            bvvwVar.r(str);
            if (cuxt.j(str, cuxt.a)) {
                bvvw bvvwVar2 = new bvvw();
                bvvwVar2.as(new dtzq("PHONE_NUMBERS_EQUAL($V, $V, 0)", new Object[]{ParticipantsTable.c.f, str}));
                bvvw bvvwVar3 = new bvvw();
                bvvwVar3.ar(bvvwVar, bvvwVar2);
                bvvwVar = bvvwVar3;
            }
            bvvwVar.w(-2);
            bvvn e = ParticipantsTable.e();
            e.z("+isBlockedDestinationInBugleDb");
            e.e(new Function() { // from class: crqx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvtg bvtgVar = (bvtg) obj;
                    entd entdVar = crrm.a;
                    return new bvth[]{bvtgVar.v, bvtgVar.f, bvtgVar.h, bvtgVar.z};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.g(bvvwVar);
            dtsu o = e.b().o();
            try {
                bvti bvtiVar = (bvti) o;
                if (bvtiVar.getCount() == 0) {
                    ffig.a(o, null);
                    ffig.a(f, null);
                    return null;
                }
                while (bvtiVar.moveToNext()) {
                    if (bvtiVar.t()) {
                        ffig.a(o, null);
                        ffig.a(f, null);
                        return true;
                    }
                }
                ffig.a(o, null);
                ffig.a(f, null);
                return false;
            } finally {
            }
        } finally {
        }
    }

    private final void h(String str) {
        axnw.h(((cfyt) this.n.b()).b(new IllegalArgumentException(a.a(str, "Destination input to DestinationBlocker#", " is null or empty"))));
    }

    public final ParticipantsTable.BindData a(String str) {
        return ((bdrr) this.c.b()).d(str);
    }

    public final crro b(final crqk crqkVar) {
        efbd.b();
        final crrn crrnVar = (crrn) crro.a.createBuilder();
        crrnVar.copyOnWrite();
        crro crroVar = (crro) crrnVar.instance;
        crroVar.b |= 1;
        crroVar.c = crqkVar.b;
        crrnVar.copyOnWrite();
        crro crroVar2 = (crro) crrnVar.instance;
        crroVar2.b |= 8;
        crroVar2.f = crqkVar.c;
        crrnVar.copyOnWrite();
        crro crroVar3 = (crro) crrnVar.instance;
        crroVar3.b |= 16;
        crroVar3.g = crqkVar.d;
        int a2 = erfd.a(crqkVar.h);
        crrnVar.copyOnWrite();
        crro crroVar4 = (crro) crrnVar.instance;
        crroVar4.b |= 32;
        crroVar4.h = a2;
        return (crro) this.i.c("DestinationBlocker#updateBlockStatus", new emyl() { // from class: crre
            /* JADX WARN: Code restructure failed: missing block: B:40:0x010f, code lost:
            
                if (r0 != null) goto L58;
             */
            @Override // defpackage.emyl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 460
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.crre.get():java.lang.Object");
            }
        });
    }

    public final String c(String str) {
        ekzz f = eleg.f("DestinationBlocker#getDestinationForBlockCheck");
        try {
            ParticipantsTable.BindData c = ((bdrr) this.c.b()).c(str);
            if (c != null) {
                String P = c.P();
                if (!TextUtils.isEmpty(P)) {
                    ffig.a(f, null);
                    return P;
                }
                axnw.h(((cfyt) this.n.b()).b(new IllegalArgumentException("Destination is Rbm but has no empty destination")));
            }
            ffig.a(f, null);
            return str;
        } finally {
        }
    }

    public final boolean d(aoku aokuVar) {
        return e(aokuVar.m(true));
    }

    public final boolean e(String str) {
        efbd.b();
        if (str == null || str.length() == 0) {
            h("isBlockedInBugleFallbackToTelephony");
            return false;
        }
        Boolean g = g(str);
        return g != null ? g.booleanValue() : f(str);
    }

    public final boolean f(String str) {
        efbd.b();
        if (str.length() == 0) {
            h("isBlockedInTelephony");
            return false;
        }
        ekzz f = eleg.f("DestinationBlocker#isBlocked");
        try {
            if (this.e.e()) {
                Optional a2 = ((crql) this.f.b()).a(c(str));
                if (a2.isPresent()) {
                    boolean booleanValue = ((Boolean) a2.get()).booleanValue();
                    ffig.a(f, null);
                    return booleanValue;
                }
            }
            Boolean g = g(str);
            boolean booleanValue2 = g != null ? g.booleanValue() : false;
            ffig.a(f, null);
            return booleanValue2;
        } finally {
        }
    }
}
