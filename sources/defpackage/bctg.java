package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bctg {
    public static final /* synthetic */ int b = 0;
    private static final Comparator c = Comparator.EL.thenComparing(Comparator.CC.comparing(new Function() { // from class: bctc
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo448andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
            int i = bctg.b;
            return bctg.b(bindData.R(), bindData.F());
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, Comparator.CC.nullsLast(Comparator.CC.naturalOrder())), new Function() { // from class: bctd
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo448andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ParticipantsTable.BindData) obj).W();
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, Comparator.CC.nullsLast(Comparator.CC.naturalOrder()));
    public final cuxh a;
    private final Context d;
    private final ffbr e;

    static {
        Comparator.EL.thenComparing(Comparator.CC.comparing(new Function() { // from class: bcte
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Recipient recipient = (Recipient) obj;
                int i = bctg.b;
                return bctg.b(recipient.w(), recipient.q());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Comparator.CC.nullsLast(Comparator.CC.naturalOrder())), new Function() { // from class: bctf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = bctg.b;
                return ((Recipient) obj).g().j();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Comparator.CC.nullsLast(Comparator.CC.naturalOrder()));
    }

    public bctg(Context context, cuxh cuxhVar, ffbr ffbrVar) {
        this.d = context;
        this.a = cuxhVar;
        this.e = ffbrVar;
    }

    public static String b(String str, cjwi cjwiVar) {
        if (cjwiVar != cjwi.PROFILE_PEOPLE_SHARING_SOURCE) {
            return str;
        }
        return null;
    }

    public final String a(bdvj bdvjVar) {
        engw engwVar = bdvjVar.b.isEmpty() ? bdvjVar.a : bdvjVar.b;
        if (engwVar.isEmpty()) {
            return this.d.getString(R.string.group_conversation_title_everyone_else_left);
        }
        engwVar.size();
        return (String) Collection.EL.stream(engwVar).sorted(c).map(new Function() { // from class: bcsz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bctg bctgVar = bctg.this;
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                return aswb.a() ? cuxh.a(bctgVar.c(bindData)) : bctgVar.c(bindData);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: bcta
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((String) obj);
            }
        }).collect(Collectors.collectingAndThen(Collectors.joining(", "), new Function() { // from class: bctb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = (String) obj;
                return aswb.a() ? str : bctg.this.a.c(str);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    public final String c(ParticipantsTable.BindData bindData) {
        String a = ((bdrt) this.e.b()).a(bindData, true);
        String P = bindData.P();
        return bindData.F() == cjwi.PROFILE_PEOPLE_SHARING_SOURCE ? !TextUtils.isEmpty(P) ? P : this.d.getResources().getString(R.string.unknown_sender) : a;
    }
}
