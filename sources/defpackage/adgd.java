package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgd {
    public final byzp a;
    public final bcwz b;
    public final Context c;
    public final ffbr d;
    public final bcvw e;
    public final ffbr f;
    public final aolr g;
    public final errl h;
    public final ffbr i;
    private final ffbr j;
    private final ffbr k;

    public adgd(Context context, byzp byzpVar, bcwz bcwzVar, ffbr ffbrVar, bcvw bcvwVar, ffbr ffbrVar2, aolr aolrVar, ffbr ffbrVar3, errl errlVar, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.c = context;
        this.a = byzpVar;
        this.b = bcwzVar;
        this.d = ffbrVar;
        this.e = bcvwVar;
        this.j = ffbrVar2;
        this.g = aolrVar;
        this.f = ffbrVar3;
        this.h = errlVar;
        this.i = ffbrVar4;
        this.k = ffbrVar5;
    }

    public static void c(adde addeVar) {
        if (addeVar.d.isEmpty() && addeVar.e.isEmpty() && addeVar.f.isEmpty()) {
            throw new IllegalArgumentException("Text and/or subject and/or attachment must be specified");
        }
    }

    public final ConversationIdType a(adde addeVar) {
        long j = addeVar.b;
        if (j < 0) {
            throw new IllegalArgumentException("A positive threadId must be specified");
        }
        ConversationIdType a = ((Boolean) ayhv.a.e()).booleanValue() ? ((ayhm) this.k.b()).a(new cpxu(j)) : ((bczy) this.j.b()).m(j);
        if (a.b()) {
            throw new IllegalArgumentException(a.s(j, "No existing conversation found for threadId: "));
        }
        return a;
    }

    final elfl b(final adde addeVar, final ConversationIdType conversationIdType) {
        return elfo.g(new Callable() { // from class: adfy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return engw.n(((bdfw) adgd.this.d.b()).a(conversationIdType, true));
            }
        }, this.h).i(new eroh() { // from class: adfz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                engw engwVar = (engw) obj;
                boolean isEmpty = engwVar.isEmpty();
                final adde addeVar2 = addeVar;
                if (isEmpty) {
                    throw new IllegalArgumentException("No recipients for thread: " + addeVar2.b);
                }
                engr engrVar = new engr();
                Iterator<E> it = addeVar2.f.iterator();
                while (true) {
                    final adgd adgdVar = adgd.this;
                    if (!it.hasNext()) {
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        final engw g = engrVar.g();
                        Stream stream = Collection.EL.stream(engwVar);
                        final aolr aolrVar = adgdVar.g;
                        aolrVar.getClass();
                        return adgdVar.e.b(conversationIdType2, (engw) stream.map(new Function() { // from class: adga
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return aolr.this.r((String) obj2);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(endq.a), addeVar2.e, addeVar2.d, g, addeVar2.c, false, false).h(new emwl() { // from class: adgc
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                Integer num = (Integer) obj2;
                                if (num.intValue() == 3) {
                                    ConversationIdType conversationIdType3 = conversationIdType2;
                                    adgd adgdVar2 = adgd.this;
                                    bcyk a = ((azwh) adgdVar2.f.b()).a(conversationIdType3);
                                    if (a == null) {
                                        throw new IllegalArgumentException("No conversation found for conversationId: ".concat(String.valueOf(String.valueOf(conversationIdType3))));
                                    }
                                    if (a.L() == 0) {
                                        engw engwVar2 = g;
                                        adde addeVar3 = addeVar2;
                                        return Integer.valueOf(adgdVar2.e.a(addeVar3.d, addeVar3.c, engwVar2, "MDE doesn't support 1:1 RCS"));
                                    }
                                }
                                return num;
                            }
                        }, adgdVar.h).h(new emwl() { // from class: adgb
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                MessageCoreData h;
                                int intValue = ((Integer) obj2).intValue();
                                adde addeVar3 = addeVar2;
                                UUID fromString = addeVar3.g.isEmpty() ? null : UUID.fromString(addeVar3.g);
                                ConversationIdType conversationIdType3 = conversationIdType2;
                                adgd adgdVar2 = adgd.this;
                                if (intValue == 0) {
                                    h = adgdVar2.a.s(conversationIdType3, addeVar3.d, fromString);
                                } else if (intValue == 1) {
                                    h = adgdVar2.a.r(conversationIdType3, addeVar3.d, addeVar3.e, fromString);
                                } else {
                                    if (intValue != 3) {
                                        throw new IllegalArgumentException(a.f(intValue, "Protocol ", " not supported"));
                                    }
                                    if (addeVar3.f.isEmpty()) {
                                        if (addeVar3.d.isEmpty()) {
                                            throw new IllegalArgumentException("No text or attachment specified");
                                        }
                                    } else if (addeVar3.f.size() > 1) {
                                        throw new IllegalArgumentException("A message sent to an RCS conversation can only have a single attachment, but " + addeVar3.f.size() + " were provided");
                                    }
                                    h = adgdVar2.a.h(conversationIdType3, null, ((ckac) adgdVar2.i.b()).b(addeVar3.c), addeVar3.d, "text/plain", fromString);
                                }
                                engw engwVar2 = g;
                                for (int i = 0; i < ((enou) engwVar2).c; i++) {
                                    h.aL((MessagePartCoreData) engwVar2.get(i));
                                }
                                return h;
                            }
                        }, adgdVar.h);
                    }
                    adco adcoVar = (adco) it.next();
                    if (adcoVar.d.isEmpty()) {
                        throw new IllegalArgumentException("Cannot process attachment with empty uri");
                    }
                    cbaq f = cbgi.c(adgdVar.c).f(Uri.parse(adcoVar.d), null, eepm.a);
                    if (f == null) {
                        throw new RuntimeException("Cannot copy the attachment.");
                    }
                    long j = f.b;
                    if (j <= 0) {
                        throw new IllegalArgumentException("Attachment size is zero or less than zero.");
                    }
                    bcwz bcwzVar = adgdVar.b;
                    Uri uri = f.a;
                    bcxb C = bcxc.C();
                    bcqk bcqkVar = (bcqk) C;
                    bcqkVar.d = uri;
                    C.p(j);
                    bcqkVar.e = Uri.parse(adcoVar.d);
                    MessagePartData c = bcwzVar.c(C.r());
                    if (!adcoVar.c.isEmpty()) {
                        c.az(adcoVar.c);
                    }
                    if (!adcoVar.b.isEmpty()) {
                        c.at(adcoVar.b);
                    }
                    engrVar.h(c);
                }
            }
        }, this.h);
    }
}
