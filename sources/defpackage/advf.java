package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class advf implements ejuh {
    public final cqoh a;
    public final ffbr b;
    public final AtomicReference c = new AtomicReference(ejug.a);
    public final ffbr d;
    public final adva e;
    public final ffbr f;
    public final Context g;
    private final errl h;
    private final errl i;

    public advf(Context context, errl errlVar, errl errlVar2, cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, adva advaVar) {
        this.g = context;
        this.h = errlVar;
        this.i = errlVar2;
        this.a = cqohVar;
        this.b = ffbrVar;
        this.f = ffbrVar2;
        this.d = ffbrVar3;
        this.e = advaVar;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        ekzz f = eleg.f("MessageDataSource#ProblematicConversationDataSource#LoadData");
        try {
            erph erphVar = new erph(erqt.i((ejug) this.c.get()));
            f.a(erphVar);
            f.close();
            return erphVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        ekzz f = eleg.f("MessageDataSource#ProblematicConversationDataSource#FetchAndStoreData");
        try {
            adva advaVar = this.e;
            final int i = ((aduu) advaVar).b;
            final int i2 = ((aduu) advaVar).a;
            elfl h = elfo.g(new Callable() { // from class: advd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    aduw aduwVar;
                    SpannableString spannableString;
                    SpannableString spannableString2;
                    HashMap hashMap = new HashMap();
                    buxo d = MessagesTable.d();
                    d.z("getConversations");
                    d.d(new buxl(MessagesTable.c.i, false));
                    d.x(i);
                    buuo buuoVar = (buuo) d.b().o();
                    advf advfVar = advf.this;
                    while (buuoVar.moveToNext()) {
                        try {
                            MessageCoreData a = ((byzp) advfVar.f.b()).a();
                            a.aN(buuoVar);
                            ConversationIdType z = a.z();
                            if (hashMap.containsKey(z)) {
                                aduwVar = (aduw) hashMap.get(z);
                            } else if (hashMap.size() < i2) {
                                aduwVar = new adur();
                                String J = ((bczy) advfVar.b.b()).J(z);
                                if (TextUtils.isEmpty(J)) {
                                    String string = advfVar.g.getString(R.string.conversation_empty_name);
                                    spannableString2 = new SpannableString(string);
                                    spannableString2.setSpan(new StyleSpan(2), 0, string.length(), 18);
                                } else {
                                    spannableString2 = new SpannableString(J);
                                }
                                aduwVar.d(spannableString2);
                                aduwVar.c(z);
                                hashMap.put(z, aduwVar);
                            } else {
                                continue;
                            }
                            ((bdpt) advfVar.d.b()).c(a, true);
                            String ar = a.ar();
                            if (TextUtils.isEmpty(ar)) {
                                String al = a.al();
                                String string2 = advfVar.g.getString(R.string.message_empty_name);
                                spannableString = new SpannableString(string2);
                                spannableString.setSpan(new StyleSpan(2), 0, string2.length(), 18);
                                if (al != null) {
                                    int ordinal = csud.a(al).ordinal();
                                    String string3 = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 5 ? advfVar.g.getString(R.string.message_type_other) : advfVar.g.getString(R.string.message_type_vcard) : advfVar.g.getString(R.string.message_type_video) : advfVar.g.getString(R.string.message_type_image) : advfVar.g.getString(R.string.message_type_text);
                                    spannableString = new SpannableString(string3);
                                    spannableString.setSpan(new StyleSpan(2), 0, string3.length(), 18);
                                }
                            } else {
                                spannableString = new SpannableString(ar);
                            }
                            long o = a.o();
                            MessageIdType B = a.B();
                            if (B == null) {
                                throw new NullPointerException("Null messageId");
                            }
                            aduwVar.e(new aduv(spannableString, o, B));
                        } catch (Throwable th) {
                            try {
                                buuoVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    buuoVar.close();
                    Stream map = Collection.EL.stream(hashMap.values()).map(new Function() { // from class: advc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((aduw) obj).a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i3 = engw.d;
                    return (engw) map.collect(endq.a);
                }
            }, this.i).h(new emwl() { // from class: adve
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    engw engwVar = (engw) obj;
                    cfup cfupVar = adyc.a;
                    return engwVar;
                }
            }, this.h).h(new emwl() { // from class: advb
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    if (obj != null) {
                        advf advfVar = advf.this;
                        advfVar.c.set(ejug.a(obj, advfVar.a.f()));
                    }
                    return obj;
                }
            }, this.h);
            f.b(h);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final /* synthetic */ Object c() {
        return "PROBLEMATIC_CONVERSATIONS_DATA";
    }
}
