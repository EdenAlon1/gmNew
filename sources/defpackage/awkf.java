package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awkf implements awks {
    public static final entd a = entd.c("BugleGroupManagement");
    public final errl b;
    public final errl c;
    public final ffbr d;
    public final avkj e;
    public final awmi f;
    public final ffbr g;
    public final ffbr h;
    public final avuh i;

    public awkf(errl errlVar, errl errlVar2, awmi awmiVar, ffbr ffbrVar, avkj avkjVar, ffbr ffbrVar2, ffbr ffbrVar3, avuh avuhVar) {
        this.b = errlVar;
        this.c = errlVar2;
        this.f = awmiVar;
        this.d = ffbrVar;
        this.e = avkjVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = avuhVar;
    }

    private final elfl b(final ConversationIdType conversationIdType, final ayhd ayhdVar) {
        return elfo.g(new Callable() { // from class: awke
            @Override // java.util.concurrent.Callable
            public final Object call() {
                entd entdVar = awkf.a;
                String[] strArr = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.ap("setConversationErrorState");
                bsoeVar.x(ayhd.this);
                return bsoeVar.f(conversationIdType) ? ceyt.i() : ceyt.k();
            }
        }, this.c);
    }

    @Override // defpackage.awks
    public final elfl a(final ConversationIdType conversationIdType, final awxc awxcVar) {
        awvp awvpVar = awxcVar.j;
        if (awvpVar == null) {
            awvpVar = awvp.a;
        }
        if (!awvpVar.c) {
            return elfo.e(ceyt.i());
        }
        ayhd ayhdVar = ayhd.RCS_GROUP_NOT_FOUND;
        ayhd b = ayhd.b(awvpVar.d);
        if (b == null) {
            b = ayhd.NONE;
        }
        if (ayhdVar.equals(b)) {
            ayhd b2 = ayhd.b(awvpVar.d);
            if (b2 == null) {
                b2 = ayhd.NONE;
            }
            return b(conversationIdType, b2).i(new eroh() { // from class: awjx
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final awui awuiVar = awxcVar.l;
                    if (awuiVar == null) {
                        awuiVar = awui.a;
                    }
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    final awkf awkfVar = awkf.this;
                    return awkfVar.f.g(conversationIdType2).i(new eroh() { // from class: awjy
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final awkf awkfVar2 = awkf.this;
                            final awkh awkhVar = (awkh) obj2;
                            final axad axadVar = (axad) awkfVar2.i.fP(cslr.a());
                            final ConversationIdType conversationIdType3 = conversationIdType2;
                            elfl g = elfo.g(new Callable() { // from class: awjz
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return ((bczy) awkf.this.d.b()).L(conversationIdType3);
                                }
                            }, awkfVar2.c);
                            final awui awuiVar2 = awuiVar;
                            elfl h = g.h(new emwl() { // from class: awka
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    awkf awkfVar3 = awkf.this;
                                    List list = (List) obj3;
                                    avld avldVar = (avld) awkfVar3.h.b();
                                    awkh awkhVar2 = awkhVar;
                                    String n = awkhVar2.n();
                                    int size = list.size();
                                    axad axadVar2 = axadVar;
                                    avldVar.f(n, size, 3, axadVar2);
                                    awuv awuvVar = (awuv) awuw.a.createBuilder();
                                    String n2 = awkhVar2.n();
                                    awuvVar.copyOnWrite();
                                    awuw awuwVar = (awuw) awuvVar.instance;
                                    awuwVar.b |= 1;
                                    awuwVar.c = n2;
                                    String l = awkhVar2.l();
                                    awuvVar.copyOnWrite();
                                    awuw awuwVar2 = (awuw) awuvVar.instance;
                                    awuwVar2.b |= 2;
                                    awuwVar2.d = l;
                                    awuvVar.copyOnWrite();
                                    awuw awuwVar3 = (awuw) awuvVar.instance;
                                    awui awuiVar3 = awuiVar2;
                                    awuiVar3.getClass();
                                    awuwVar3.f = awuiVar3;
                                    awuwVar3.b |= 8;
                                    Stream map = Collection.EL.stream(((aolr) awkfVar3.g.b()).y(list)).map(new Function() { // from class: awjv
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj4) {
                                            entd entdVar = awkf.a;
                                            return (awui) ((aoku) obj4).e().orElseThrow(new Supplier() { // from class: awjw
                                                @Override // java.util.function.Supplier
                                                public final Object get() {
                                                    return new avkg("Group endpoint must have a conference URI");
                                                }
                                            });
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    int i = engw.d;
                                    awuvVar.a((engw) map.collect(endq.a));
                                    awus awusVar = (awus) awut.a.createBuilder();
                                    String n3 = awkhVar2.n();
                                    awusVar.copyOnWrite();
                                    awut awutVar = (awut) awusVar.instance;
                                    awutVar.b |= 1;
                                    awutVar.c = n3;
                                    awusVar.copyOnWrite();
                                    awut.a((awut) awusVar.instance);
                                    awusVar.copyOnWrite();
                                    awut awutVar2 = (awut) awusVar.instance;
                                    axadVar2.getClass();
                                    awutVar2.e = axadVar2;
                                    awutVar2.b |= 4;
                                    eyee byteString = ((awut) awusVar.build()).toByteString();
                                    awuvVar.copyOnWrite();
                                    awuw awuwVar4 = (awuw) awuvVar.instance;
                                    awuwVar4.b |= 16;
                                    awuwVar4.h = byteString;
                                    return (awuw) awuvVar.build();
                                }
                            }, awkfVar2.b);
                            final avkj avkjVar = awkfVar2.e;
                            avkjVar.getClass();
                            return h.i(new eroh() { // from class: awkb
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    return avkj.this.b((awuw) obj3);
                                }
                            }, awkfVar2.b).h(new emwl() { // from class: awkc
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    awuz awuzVar = (awuz) obj3;
                                    awud awudVar = awuzVar.c;
                                    if (awudVar == null) {
                                        awudVar = awud.a;
                                    }
                                    awuc b3 = awuc.b(awudVar.c);
                                    if (b3 == null) {
                                        b3 = awuc.UNKNOWN_STATUS;
                                    }
                                    if (!b3.equals(awuc.OK) && !b3.equals(awuc.PENDING)) {
                                        awkh awkhVar2 = awkhVar;
                                        avld avldVar = (avld) awkf.this.h.b();
                                        String n = awkhVar2.n();
                                        awud awudVar2 = awuzVar.c;
                                        if (awudVar2 == null) {
                                            awudVar2 = awud.a;
                                        }
                                        avldVar.b(n, awudVar2, axadVar);
                                    }
                                    int ordinal = b3.ordinal();
                                    if (ordinal == 0) {
                                        ((ensz) ((ensz) awkf.a.i()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ErrorStateGroupMetadataProcessor", "handleCreateGroupChatResponse", 218, "ErrorStateGroupMetadataProcessor.java")).q("Re-create RCS group operation returned UNKNOWN_STATUS.");
                                        return ceyt.k();
                                    }
                                    if (ordinal == 1 || ordinal == 2) {
                                        return ceyt.i();
                                    }
                                    if (ordinal == 3) {
                                        ((ensz) ((ensz) awkf.a.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ErrorStateGroupMetadataProcessor", "handleCreateGroupChatResponse", 212, "ErrorStateGroupMetadataProcessor.java")).q("Re-create RCS group failed transiently.");
                                        return ceyt.m();
                                    }
                                    if (ordinal != 4) {
                                        throw new IllegalStateException("Unrecognized ChatApiResult.Status");
                                    }
                                    ((ensz) ((ensz) awkf.a.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ErrorStateGroupMetadataProcessor", "handleCreateGroupChatResponse", 215, "ErrorStateGroupMetadataProcessor.java")).q("Re-create RCS group failed permanently.");
                                    return ceyt.k();
                                }
                            }, awkfVar2.b).e(IllegalArgumentException.class, new emwl() { // from class: awkd
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    ((avld) awkf.this.h.b()).c(awkhVar.n(), ((IllegalArgumentException) obj3) instanceof avkg ? eqww.CHAT_API_INVALID_REMOTE_PARTICIPANT : eqww.CHAT_API_TRANSPORT_ILLEGAL_ARGUMENTS, axadVar);
                                    return ceyt.k();
                                }
                            }, awkfVar2.b);
                        }
                    }, awkfVar.b);
                }
            }, this.b);
        }
        ayhd b3 = ayhd.b(awvpVar.d);
        if (b3 == null) {
            b3 = ayhd.NONE;
        }
        return b(conversationIdType, b3);
    }
}
