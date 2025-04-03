package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjnb implements cjjt {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/pipeline/rcs/send/PassToChatApiInterceptor");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final cjjv i;

    public cjnb(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffbrVar7;
        this.i = new cjjv("PassToChatApiInterceptor");
    }

    private final awya e(cjnj cjnjVar) {
        int ordinal = cjnjVar.h.ordinal();
        if (ordinal == 0) {
            awzn awznVar = cjnjVar.h;
            Objects.toString(awznVar);
            throw new IllegalArgumentException("Unsupported receipt type: ".concat(awznVar.toString()));
        }
        if (ordinal == 1) {
            awxv awxvVar = (awxv) awya.a.createBuilder();
            awxvVar.getClass();
            awyb.c(awxz.CONTROL, awxvVar);
            awyb.b(awxx.HIGH, awxvVar);
            awyb.d(awxvVar);
            return awyb.a(awxvVar);
        }
        if (ordinal == 2) {
            awxv awxvVar2 = (awxv) awya.a.createBuilder();
            awxvVar2.getClass();
            awyb.c(awxz.CONTROL, awxvVar2);
            awyb.b(awxx.NORMAL, awxvVar2);
            awyb.d(awxvVar2);
            return awyb.a(awxvVar2);
        }
        if (ordinal != 3) {
            throw new ffcd();
        }
        awxv awxvVar3 = (awxv) awya.a.createBuilder();
        awxvVar3.getClass();
        awyb.c(awxz.CONTROL, awxvVar3);
        awyb.b(awxx.HIGH, awxvVar3);
        awyb.d(awxvVar3);
        return awyb.a(awxvVar3);
    }

    private final awzj f(cjnj cjnjVar, String str, awui awuiVar) {
        awzi awziVar = (awzi) awzj.a.createBuilder();
        awziVar.getClass();
        awzk.b(cjnjVar.i.f(), awziVar);
        awzl awzlVar = (awzl) awzo.a.createBuilder();
        awzlVar.getClass();
        String f = cjnjVar.g.f();
        awzlVar.copyOnWrite();
        awzo awzoVar = (awzo) awzlVar.instance;
        awzoVar.b |= 1;
        awzoVar.c = f;
        awzlVar.copyOnWrite();
        awzo awzoVar2 = (awzo) awzlVar.instance;
        awzoVar2.d = cjnjVar.h.e;
        awzoVar2.b |= 2;
        eyfy build = awzlVar.build();
        build.getClass();
        awziVar.copyOnWrite();
        awzj awzjVar = (awzj) awziVar.instance;
        awzjVar.d = (awzo) build;
        awzjVar.c = 5;
        awzk.d(cjnjVar.a, awziVar);
        str.getClass();
        awziVar.copyOnWrite();
        awzj awzjVar2 = (awzj) awziVar.instance;
        awzjVar2.b |= 2;
        awzjVar2.f = str;
        awziVar.copyOnWrite();
        awzj awzjVar3 = (awzj) awziVar.instance;
        awzjVar3.i = cjnjVar.b;
        awzjVar3.b |= 16;
        awuiVar.getClass();
        awziVar.copyOnWrite();
        awzj awzjVar4 = (awzj) awziVar.instance;
        awzjVar4.h = awuiVar;
        awzjVar4.b |= 8;
        return awzk.a(awziVar);
    }

    @Override // defpackage.cjjt
    public final cjjv a() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cjnj r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjnb.c(cjnj, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.cjjt
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cjns r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjnb.b(cjns, ffgu):java.lang.Object");
    }
}
