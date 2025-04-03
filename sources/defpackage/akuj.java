package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import com.google.android.apps.messaging.R;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akuj extends eins {
    private static final enru a = enru.c("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal");

    /* compiled from: PG */
    public interface a {
        ctvs cS();

        engw eN();
    }

    private static MatrixCursor d() {
        return new MatrixCursor(einr.b);
    }

    private final boolean e() {
        return ((a) ekhw.a(getContext(), a.class)).cS().e();
    }

    @Override // defpackage.eins
    public final Cursor a() {
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal", "queryNonIndexableKeys", 65, "MessagesSearchIndexablesProvider.java")).q("MessagesSearchIndexablesProvider: Querying NonIndexableKeys.");
        if (!e()) {
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal", "queryNonIndexableKeys", 67, "MessagesSearchIndexablesProvider.java")).q("MessagesSearchIndexablesProvider: The device is not SMS capable.");
            return d();
        }
        MatrixCursor matrixCursor = new MatrixCursor(einr.c);
        if (((Boolean) ((cfup) cxen.b.get()).e()).booleanValue()) {
            Context context = getContext();
            context.getClass();
            matrixCursor.addRow(new Object[]{context.getString(R.string.cmc_consent_key)});
        }
        return matrixCursor;
    }

    @Override // defpackage.eins
    public final Cursor b() {
        return d();
    }

    @Override // defpackage.eins
    public final Cursor c() {
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal", "queryXmlResources", 50, "MessagesSearchIndexablesProvider.java")).q("MessagesSearchIndexablesProvider: Querying XmlResources.");
        if (e()) {
            final akum akumVar = new akum(this, ((a) ekhw.a(getContext(), a.class)).eN());
            Collection.EL.stream(akumVar.c).filter(new Predicate() { // from class: akuk
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
                    Object obj2;
                    obj2 = ((akup) obj).c().get();
                    return ((Boolean) obj2).booleanValue();
                }
            }).forEach(new Consumer() { // from class: akul
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    akup akupVar = (akup) obj;
                    String b = akupVar.b();
                    int a2 = akupVar.a();
                    akum akumVar2 = akum.this;
                    akumVar2.b.newRow().add("rank", 0).add("xmlResId", Integer.valueOf(a2)).add("iconResId", 0).add("intentAction", "android.intent.action.MAIN").add("intentTargetPackage", akumVar2.a).add("intentTargetClass", b);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return akumVar.b;
        }
        ensk h2 = enruVar.h();
        h2.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal", "queryXmlResources", 52, "MessagesSearchIndexablesProvider.java")).q("MessagesSearchIndexablesProvider: The device is not sms capable");
        return d();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }
}
