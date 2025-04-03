package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvfx implements bdod, bdnu, bdnx {
    private final aswk a;

    public cvfx(aswk aswkVar) {
        this.a = aswkVar;
    }

    private static final void l(final MessageCoreData messageCoreData, final int i, int i2) {
        if (cvfw.a(messageCoreData)) {
            bvvr f = ParticipantsTable.f();
            f.ap("recordInviteStateInVideoReachability");
            f.T(i2);
            f.V(new Function() { // from class: cvfv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvvw bvvwVar = (bvvw) obj;
                    brwp a = brww.a();
                    a.c(brww.c.c);
                    final MessageCoreData messageCoreData2 = messageCoreData;
                    a.e(new Function() { // from class: cvfu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brwv brwvVar = (brwv) obj2;
                            brwvVar.b(MessageCoreData.this.z());
                            return brwvVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bvvwVar.l(a.b());
                    int intValue = ParticipantsTable.i().intValue();
                    if (intValue < 13050) {
                        dtub.w("video_reachability", intValue);
                    }
                    bvvwVar.aq(new dtwe("participants.video_reachability", 1, Integer.valueOf(i)));
                    return bvvwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            f.b().e();
        }
    }

    @Override // defpackage.bdnx
    public final /* synthetic */ ekzz c() {
        return bdnw.a();
    }

    @Override // defpackage.bdnu
    public final void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (this.a.a()) {
            l(messageCoreData, 8, 10);
        }
    }

    @Override // defpackage.bdnx, defpackage.bdns
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.bdod
    public final void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        messageCoreData.getClass();
        messageIdType.getClass();
        if (this.a.a()) {
            l(messageCoreData, 7, 11);
        }
    }

    @Override // defpackage.bdnx, defpackage.bdns
    public final void gc(MessageCoreData messageCoreData) {
        if (this.a.a()) {
            l(messageCoreData, 8, 10);
        }
    }

    @Override // defpackage.bdod
    public final boolean j() {
        return this.a.a();
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, ffgu ffguVar) {
        return messageCoreData;
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, ffgu ffguVar) {
        return messageCoreData;
    }
}
