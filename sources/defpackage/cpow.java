package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpow {
    public final ffbr a;
    private final ffbr b;
    private final errl c;

    public cpow(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = errlVar;
    }

    final elfl a(awui awuiVar, String str) {
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        return b != awuh.GROUP ? elfo.e((fcek) new cpiw().fP(awuiVar)) : b(str);
    }

    final elfl b(final String str) {
        cpke cpkeVar = (cpke) this.b.b();
        return cpkeVar.b(cpke.a(str, epby.TACHYGRAM_GET_ROUTING_TOKEN)).h(new emwl() { // from class: cpka
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = cpke.a;
                return ((Optional) obj).flatMap(new Function() { // from class: cpjt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        entd entdVar2 = cpke.a;
                        byte[] au = ((bseh) obj2).au();
                        if (au != null && au.length != 0) {
                            return Optional.of(eyee.x(au));
                        }
                        ((ensz) ((ensz) cpke.a.j()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "getGroupRoutingTokenFromConversationBindData", 250, "TachygramDatabaseOperations.java")).q("No routing token stored in conversation for tachygram group.");
                        return Optional.empty();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, cpkeVar.d).h(new emwl() { // from class: cpou
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final fcej a = cpta.a();
                fgtg fgtgVar = fgtg.GROUP_ID;
                a.copyOnWrite();
                fcek fcekVar = (fcek) a.instance;
                fcek fcekVar2 = fcek.a;
                fcekVar.b = fgtgVar.a();
                a.copyOnWrite();
                fcek fcekVar3 = (fcek) a.instance;
                String str2 = str;
                str2.getClass();
                fcekVar3.c = str2;
                ((Optional) obj).ifPresent(new Consumer() { // from class: cpov
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        fcej fcejVar = fcej.this;
                        eyee eyeeVar = (eyee) obj2;
                        fcejVar.copyOnWrite();
                        fcek fcekVar4 = (fcek) fcejVar.instance;
                        fcek fcekVar5 = fcek.a;
                        eyeeVar.getClass();
                        fcekVar4.e = eyeeVar;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return (fcek) a.build();
            }
        }, this.c);
    }

    final elfl c(fcek fcekVar) {
        final cpke cpkeVar = (cpke) this.b.b();
        return cpkeVar.b(cpke.a(fcekVar.c, epby.TACHYGRAM_TO_CHAT_API_INCOMING_MESSAGE_ADAPTER)).h(new emwl() { // from class: cpjv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final cpke cpkeVar2 = cpke.this;
                return ((Optional) obj).flatMap(new Function() { // from class: cpjz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        String ac = ((bseh) obj2).ac();
                        boolean isEmpty = TextUtils.isEmpty(ac);
                        cpke cpkeVar3 = cpke.this;
                        if (!isEmpty) {
                            cpkeVar3.b.e("Bugle.Tachygram.ConferenceUriLookup.Counts", cpkd.a(1));
                            return Optional.of(ac);
                        }
                        ((ensz) ((ensz) cpke.a.j()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "getConferenceUriFromConversationBindData", 231, "TachygramDatabaseOperations.java")).q("Conversation does not contain RCS conference URI for tachygram group.");
                        cpkeVar3.b.e("Bugle.Tachygram.ConferenceUriLookup.Counts", cpkd.a(2));
                        return Optional.empty();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, cpkeVar.d).h(new emwl() { // from class: cpos
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final cpow cpowVar = cpow.this;
                return ((Optional) obj).map(new Function() { // from class: cpot
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((avkc) cpow.this.a.b()).e((String) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, this.c);
    }
}
