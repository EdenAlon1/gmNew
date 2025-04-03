package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqli {
    public static final ProfilesTable.BindData a(final ParticipantsTable.BindData bindData) {
        ProfilesTable.BindData a = ((aqkw) ProfilesTable.d("ProfileRowFactoryImpl#getOrCreateProfileRowFromParticipantId", new dtuo(new emyl() { // from class: aqla
            @Override // defpackage.emyl
            public final Object get() {
                String S = ParticipantsTable.BindData.this.S();
                S.getClass();
                return new aqku(aqlh.a(Long.parseLong(S)), false);
            }
        }), new dtum(new Function() { // from class: aqlb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((aqkw) obj).a() == null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }), new dtun(new Function() { // from class: aqlc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String[] strArr = ProfilesTable.a;
                bwlu bwluVar = new bwlu();
                ParticipantsTable.BindData bindData2 = ParticipantsTable.BindData.this;
                bwluVar.k(String.valueOf(bindData2.M()));
                String S = bindData2.S();
                S.getClass();
                bwluVar.i(Long.parseLong(S));
                return new aqku(bwluVar.a(), true);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }))).a();
        a.getClass();
        return a;
    }

    public static final ProfilesTable.BindData b(final ResolvedRecipient resolvedRecipient) {
        ProfilesTable.BindData a = ((aqkw) ProfilesTable.d("ProfileRowFactoryImpl#getOrCreateProfileRowFromRecipient", new dtuo(new emyl() { // from class: aqld
            @Override // defpackage.emyl
            public final Object get() {
                String str = ResolvedRecipient.this.F().a;
                str.getClass();
                return new aqku(aqlh.a(Long.parseLong(str)), false);
            }
        }), new dtum(new Function() { // from class: aqle
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((aqkw) obj).a() == null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }), new dtun(new Function() { // from class: aqlf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String[] strArr = ProfilesTable.a;
                bwlu bwluVar = new bwlu();
                ResolvedRecipient resolvedRecipient2 = ResolvedRecipient.this;
                bwluVar.k(resolvedRecipient2.g().o());
                String str = resolvedRecipient2.F().a;
                str.getClass();
                bwluVar.i(Long.parseLong(str));
                return new aqku(bwluVar.a(), true);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }))).a();
        a.getClass();
        return a;
    }
}
