package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxxh {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/conversation/MessageSender");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final altk e;
    public final cpbs f;
    public final cstx g;
    public final alde h;
    public final akvz i;
    public final cxwh j;
    public final errl k;
    public final ffbr l;
    public final Optional m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;

    public cxxh(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, altk altkVar, cpbs cpbsVar, cstx cstxVar, alde aldeVar, akvz akvzVar, cxwh cxwhVar, errl errlVar, ffbr ffbrVar4, Optional optional, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = altkVar;
        this.f = cpbsVar;
        this.g = cstxVar;
        this.h = aldeVar;
        this.i = akvzVar;
        this.j = cxwhVar;
        this.k = errlVar;
        this.l = ffbrVar4;
        this.m = optional;
        this.n = ffbrVar5;
        this.o = ffbrVar6;
        this.p = ffbrVar7;
        this.q = ffbrVar8;
    }

    public static boolean a(MessageCoreData messageCoreData) {
        return messageCoreData.cX() && messageCoreData.ab().size() > 1;
    }
}
