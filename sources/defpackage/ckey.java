package defpackage;

import android.util.Base64;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckey {
    public static final emyl a = cfvl.w("mms_group_name_to_telephony");
    private static final entd b = entd.c("Bugle");

    public static ckbk a(Optional optional, ckbs ckbsVar) {
        final ckbk ckbkVar = (ckbk) ckbl.a.createBuilder();
        ckbkVar.copyOnWrite();
        ckbl ckblVar = (ckbl) ckbkVar.instance;
        ckbt ckbtVar = (ckbt) ckbsVar.build();
        ckbtVar.getClass();
        ckblVar.d = ckbtVar;
        ckblVar.c = 2;
        optional.map(new Function() { // from class: ckes
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cpzf.a((UUID) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).ifPresent(new Consumer() { // from class: cket
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ckbk ckbkVar2 = ckbk.this;
                eyee eyeeVar = (eyee) obj;
                ckbkVar2.copyOnWrite();
                ckbl ckblVar2 = (ckbl) ckbkVar2.instance;
                ckbl ckblVar3 = ckbl.a;
                eyeeVar.getClass();
                ckblVar2.b |= 1;
                ckblVar2.e = eyeeVar;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ckbkVar;
    }

    public static ckbq b(String str, String str2, String str3) {
        ckbq ckbqVar = (ckbq) ckbr.a.createBuilder();
        ckbqVar.copyOnWrite();
        ((ckbr) ckbqVar.instance).b = str;
        ckbqVar.copyOnWrite();
        ((ckbr) ckbqVar.instance).d = str3;
        if (str2 != null) {
            ckbqVar.copyOnWrite();
            ((ckbr) ckbqVar.instance).c = str2;
        }
        return ckbqVar;
    }

    public static ckex c(String str) {
        return d(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007e A[Catch: eygu -> 0x0170, TryCatch #0 {eygu -> 0x0170, blocks: (B:25:0x0049, B:28:0x0053, B:29:0x0096, B:31:0x00a2, B:32:0x00a9, B:35:0x00b0, B:37:0x00c1, B:41:0x00ea, B:43:0x00fe, B:45:0x0102, B:46:0x0109, B:48:0x0107, B:49:0x012b, B:51:0x012f, B:52:0x0136, B:54:0x0134, B:57:0x0149, B:60:0x0078, B:62:0x007e, B:63:0x0082, B:65:0x0058, B:67:0x005f, B:68:0x0063), top: B:24:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ckex d(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckey.d(java.lang.String, boolean):ckex");
    }

    public static String e(String str, String str2, Optional optional) {
        ckbm ckbmVar = (ckbm) ckbn.a.createBuilder();
        if (str != null) {
            eyee x = eyee.x(str.getBytes(StandardCharsets.US_ASCII));
            ckbmVar.copyOnWrite();
            ((ckbn) ckbmVar.instance).c = x;
        }
        ckbmVar.copyOnWrite();
        ckbn ckbnVar = (ckbn) ckbmVar.instance;
        str2.getClass();
        ckbnVar.d = str2;
        return f((ckbn) ckbmVar.build(), optional);
    }

    public static String f(ckbn ckbnVar, Optional optional) {
        ckbk ckbkVar = (ckbk) ckbl.a.createBuilder();
        ckbkVar.copyOnWrite();
        ckbl ckblVar = (ckbl) ckbkVar.instance;
        ckbnVar.getClass();
        ckblVar.d = ckbnVar;
        ckblVar.c = 3;
        if (optional.isPresent()) {
            eyee a2 = cpzf.a((UUID) optional.get());
            ckbkVar.copyOnWrite();
            ckbl ckblVar2 = (ckbl) ckbkVar.instance;
            ckblVar2.b |= 1;
            ckblVar2.e = a2;
        }
        return g((ckbl) ckbkVar.build());
    }

    public static String g(ckbl ckblVar) {
        eyee byteString = ckblVar.toByteString();
        ckbi ckbiVar = (ckbi) ckbj.a.createBuilder();
        ckbiVar.copyOnWrite();
        ckbj ckbjVar = (ckbj) ckbiVar.instance;
        eyhm eyhmVar = ckbjVar.b;
        if (!eyhmVar.b) {
            ckbjVar.b = eyhmVar.a();
        }
        ckbjVar.b.put("com.google.android.apps.messaging.", byteString);
        return "proto:".concat(String.valueOf(Base64.encodeToString(((ckbj) ckbiVar.build()).toByteArray(), 2)));
    }

    private static Optional h(ckbl ckblVar) {
        eyee eyeeVar = ckblVar.e;
        return eyeeVar.H() ? Optional.empty() : Optional.of(cpzf.b(eyeeVar));
    }
}
