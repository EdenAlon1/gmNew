package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctgv {
    public static final cskc a = cskc.g("BugleDataModel", "MessageAnnotationDatabaseOperations");
    public final ffbr b;
    private final dtuu c;

    public ctgv(ffbr ffbrVar, dtuu dtuuVar) {
        this.b = ffbrVar;
        this.c = dtuuVar;
    }

    public static bduq a(final MessageIdType messageIdType) {
        ekzz f = eleg.f("MessageAnnotationDatabaseOperations#getAnnotationsForMessage");
        try {
            csix.h();
            bduq bduqVar = new bduq();
            btta b = bttf.b();
            b.z("getAnnotationsForMessage");
            b.f(new Function() { // from class: ctgm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btte btteVar = (btte) obj;
                    btteVar.e(MessageIdType.this);
                    return btteVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bduqVar.d(b.b().y());
            f.close();
            return bduqVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean b(final ConversationIdType conversationIdType, final MessageIdType messageIdType, final List list) {
        ekzz f = eleg.f("MessageAnnotationDatabaseOperations#addMessageAnnotations");
        try {
            csix.h();
            boolean booleanValue = dkta.a(list) ? false : ((Boolean) this.c.c("MessageAnnotationDatabaseOperations#addMessageAnnotationsTraced", new emyl() { // from class: ctgu
                @Override // defpackage.emyl
                public final Object get() {
                    Iterator it = list.iterator();
                    boolean z = true;
                    while (true) {
                        MessageIdType messageIdType2 = messageIdType;
                        ConversationIdType conversationIdType2 = conversationIdType;
                        if (!it.hasNext()) {
                            ctgv ctgvVar = ctgv.this;
                            ((cbgf) ctgvVar.b.b()).i(conversationIdType2);
                            cbgf cbgfVar = (cbgf) ctgvVar.b.b();
                            String[] strArr = bttf.a;
                            cbgfVar.l(conversationIdType2, messageIdType2, "messages_annotations");
                            return Boolean.valueOf(z);
                        }
                        fbuk fbukVar = (fbuk) it.next();
                        String[] strArr2 = bttf.a;
                        btrz btrzVar = new btrz();
                        btrzVar.d(conversationIdType2);
                        btrzVar.e(messageIdType2);
                        btrzVar.c(fbukVar.e);
                        btrzVar.b(fbukVar);
                        final btrw a2 = btrzVar.a();
                        final dtve c = bttf.c();
                        long b = dtub.b(bttf.c(), "messages_annotations", a2, new Function() { // from class: btrs
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dtve.this.R("messages_annotations", (ContentValues) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: btrt
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                final Long l = (Long) obj;
                                if (l.longValue() >= 0) {
                                    btrw btrwVar = btrw.this;
                                    btrwVar.a = (String) new dtuj() { // from class: btru
                                        @Override // defpackage.dtuj
                                        public final Object a() {
                                            return String.valueOf(l);
                                        }
                                    }.a();
                                    btrwVar.fY(0);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        Long.valueOf(b).getClass();
                        z &= b > -1;
                    }
                }
            })).booleanValue();
            f.close();
            return booleanValue;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean c(final ConversationIdType conversationIdType, final MessageIdType messageIdType, final List list) {
        csix.h();
        return ((Boolean) this.c.c("MessageAnnotationDatabaseOperations#setMessageAnnotations", new emyl() { // from class: ctgl
            @Override // defpackage.emyl
            public final Object get() {
                buxo d = MessagesTable.d();
                d.z("setMessageAnnotations");
                final MessageIdType messageIdType2 = messageIdType;
                d.h(new Function() { // from class: ctgk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        buxzVar.q(MessageIdType.this);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (d.b().i() == 0) {
                    ctgv.a.r("Message annotation is set on deleted message.");
                    return false;
                }
                List list2 = list;
                ConversationIdType conversationIdType2 = conversationIdType;
                ctgv ctgvVar = ctgv.this;
                String[] strArr = bttf.a;
                btsv btsvVar = new btsv();
                btsvVar.f("setMessageAnnotations");
                btsvVar.a(new Function() { // from class: ctgn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        btte btteVar = (btte) obj;
                        btteVar.e(MessageIdType.this);
                        return btteVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                btsvVar.d();
                return Boolean.valueOf(ctgvVar.b(conversationIdType2, messageIdType2, list2));
            }
        })).booleanValue();
    }
}
