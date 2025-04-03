package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dean implements cpbz {
    private final cpbs a;

    public dean(cpbs cpbsVar) {
        this.a = cpbsVar;
    }

    private final int e(int i) {
        return this.a.a(i).a;
    }

    private static bxso f(final int i) {
        Object apply;
        csix.h();
        bxtc a = bxth.a();
        a.z("getCursorForSim");
        a.c(new Function() { // from class: deak
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxtg bxtgVar = (bxtg) obj;
                bxtgVar.b(i);
                return bxtgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        apply = new Function() { // from class: deal
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bxsm) obj).i;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(bxth.c);
        bxsn[] bxsnVarArr = {(bxsn) apply};
        int intValue = bxth.c().intValue();
        if (((Integer) bxth.b.getOrDefault(bxsnVarArr[0].toString(), -1)).intValue() > intValue) {
            dtub.w("columnReference.toString()", intValue);
        }
        a.m(bxsnVarArr);
        return (bxso) a.b().o();
    }

    private final String g(int i) {
        bxso f = f(e(i));
        try {
            String e = f.moveToFirst() ? f.e() : null;
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cpbz
    public final String a(int i) {
        return g(i);
    }

    @Override // defpackage.cpbz
    public final String b(int i, ConversationIdType conversationIdType) {
        String g = g(i);
        if (g != null || conversationIdType.b()) {
            return g;
        }
        csix.h();
        return (String) bsom.j(conversationIdType, new Function() { // from class: deam
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bseh) obj).af();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpbz
    public final boolean c(int i) {
        return this.a.a(i).b.getBoolean("allowEditingSmscAddress", false);
    }

    @Override // defpackage.cpbz
    public final boolean d(int i, String str) {
        if (!c(i) || Objects.equals(str, g(i))) {
            return false;
        }
        String trim = str != null ? str.trim() : null;
        String str2 = true != TextUtils.isEmpty(trim) ? trim : null;
        csix.h();
        int e = e(i);
        bxso f = f(e);
        try {
            int count = f.getCount();
            f.close();
            if (count <= 0) {
                String[] strArr = bxth.a;
                bxrt bxrtVar = new bxrt();
                bxrtVar.h(e);
                bxrtVar.g(str2);
                azzp.a(bxrtVar.a());
                return true;
            }
            String[] strArr2 = bxth.a;
            bxte bxteVar = new bxte();
            bxteVar.ap("setSmsServiceCenterForSim");
            int intValue = bxth.c().intValue();
            int intValue2 = bxth.c().intValue();
            if (intValue2 < 29080) {
                dtub.w("smsc", intValue2);
            }
            if (intValue >= 29080) {
                dtub.u(bxteVar.a, "smsc", str2);
            }
            return bxteVar.a(e) > 0;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
