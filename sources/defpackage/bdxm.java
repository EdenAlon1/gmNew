package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdxm implements bdxh {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/database/create/shortcuts/ClearShortcutsOnDatabaseCreatedListener");
    public final ffbr b;
    private final Context c;
    private final ffbr d;
    private final errl e;
    private final errl f;
    private final ffbr g;

    public bdxm(Context context, ffbr ffbrVar, errl errlVar, errl errlVar2, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.c = context;
        this.d = ffbrVar;
        this.e = errlVar;
        this.f = errlVar2;
        this.b = ffbrVar2;
        this.g = ffbrVar3;
    }

    @Override // defpackage.bdxh
    public final void a(dtve dtveVar) {
        if (((dtqy) ((cauy) dtveVar).e).b.equals("$primary")) {
            if (((auis) this.g.b()).a()) {
                axnw.e(elfo.f(new Runnable() { // from class: bdxi
                    @Override // java.lang.Runnable
                    public final void run() {
                        String id;
                        bdxm bdxmVar = bdxm.this;
                        bdxmVar.b();
                        if (ctid.d) {
                            ciwb ciwbVar = (ciwb) bdxmVar.b.b();
                            List list = (List) Collection.EL.stream(ciwbVar.b.c()).filter(new Predicate() { // from class: civw
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
                                    String conversationId;
                                    conversationId = akb$$ExternalSyntheticApiModelOutline0.m(obj).getConversationId();
                                    return !TextUtils.isEmpty(conversationId);
                                }
                            }).collect(Collectors.toCollection(new Supplier() { // from class: civx
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new ArrayList();
                                }
                            }));
                            ensk h = ciwb.a.h();
                            h.Y(ente.a, "BugleNotifications");
                            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "clearConversationChannels", 130, "NotificationChannelManager.java")).q("Deleting conversation notification channels");
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                id = akb$$ExternalSyntheticApiModelOutline0.m(it.next()).getId();
                                ciwbVar.j(id);
                            }
                        }
                    }
                }, this.f).e(Exception.class, new emwl() { // from class: bdxj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ensk j = bdxm.a.j();
                        j.Y(ente.a, "BugleShortcuts");
                        ((enrr) ((enrr) ((enrr) j).g((Exception) obj)).h("com/google/android/apps/messaging/shared/datamodel/database/create/shortcuts/ClearShortcutsOnDatabaseCreatedListener", "onDatabaseCreated", 94, "ClearShortcutsOnDatabaseCreatedListener.java")).q("Error clearing shortcuts and notification channels on DB recreation");
                        return null;
                    }
                }, this.e));
            } else {
                try {
                    b();
                } catch (RuntimeException e) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleShortcuts");
                    ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/datamodel/database/create/shortcuts/ClearShortcutsOnDatabaseCreatedListener", "onDatabaseCreated", 'g', "ClearShortcutsOnDatabaseCreatedListener.java")).q("Error while clearing shortcuts on DB recreation");
                    return;
                }
            }
            ((akzt) this.d.b()).c("Bugle.Shortcuts.ShortcutsCleared.Count");
        }
    }

    public final void b() {
        List dynamicShortcuts;
        String id;
        Intent[] intents;
        ComponentName activity;
        CharSequence shortLabel;
        CharSequence longLabel;
        CharSequence disabledMessage;
        Set categories;
        PersistableBundle extras;
        knr[] knrVarArr;
        PersistableBundle extras2;
        String string;
        koo kooVar;
        int rank;
        PersistableBundle extras3;
        LocusId locusId;
        LocusId locusId2;
        ensk h = a.h();
        h.Y(ente.a, "BugleShortcuts");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/database/create/shortcuts/ClearShortcutsOnDatabaseCreatedListener", "clearShortcuts", 111, "ClearShortcutsOnDatabaseCreatedListener.java")).q("Clearing shortcuts for DB recreation");
        int i = kox.a;
        Context context = this.c;
        dynamicShortcuts = kox$$ExternalSyntheticApiModelOutline0.m471m(context.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m())).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            ShortcutInfo m = kox$$ExternalSyntheticApiModelOutline0.m(it.next());
            kou kouVar = new kou();
            kouVar.a = context;
            id = m.getId();
            kouVar.b = id;
            m.getPackage();
            intents = m.getIntents();
            kouVar.c = (Intent[]) Arrays.copyOf(intents, intents.length);
            activity = m.getActivity();
            kouVar.d = activity;
            shortLabel = m.getShortLabel();
            kouVar.e = shortLabel;
            longLabel = m.getLongLabel();
            kouVar.f = longLabel;
            disabledMessage = m.getDisabledMessage();
            kouVar.g = disabledMessage;
            if (Build.VERSION.SDK_INT >= 28) {
                m.getDisabledReason();
            } else {
                m.isEnabled();
            }
            categories = m.getCategories();
            kouVar.j = categories;
            extras = m.getExtras();
            if (extras == null || !extras.containsKey("extraPersonCount")) {
                knrVarArr = null;
            } else {
                int i2 = extras.getInt("extraPersonCount");
                knrVarArr = new knr[i2];
                int i3 = 0;
                while (i3 < i2) {
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i4 = i3 + 1;
                    sb.append(i4);
                    PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                    knq knqVar = new knq();
                    knqVar.a = persistableBundle.getString("name");
                    knqVar.c = persistableBundle.getString(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                    knqVar.d = persistableBundle.getString("key");
                    knqVar.e = persistableBundle.getBoolean("isBot");
                    knqVar.f = persistableBundle.getBoolean("isImportant");
                    knrVarArr[i3] = new knr(knqVar);
                    i3 = i4;
                }
            }
            kouVar.i = knrVarArr;
            m.getUserHandle();
            m.getLastChangedTimestamp();
            if (Build.VERSION.SDK_INT >= 30) {
                m.isCached();
            }
            m.isDynamic();
            m.isPinned();
            m.isDeclaredInManifest();
            m.isImmutable();
            m.isEnabled();
            m.hasKeyFieldsOnly();
            if (Build.VERSION.SDK_INT >= 29) {
                locusId = m.getLocusId();
                if (locusId != null) {
                    locusId2 = m.getLocusId();
                    kooVar = koo.a(locusId2);
                }
                kooVar = null;
            } else {
                extras2 = m.getExtras();
                if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                    kooVar = new koo(string);
                }
                kooVar = null;
            }
            kouVar.k = kooVar;
            rank = m.getRank();
            kouVar.m = rank;
            extras3 = m.getExtras();
            kouVar.n = extras3;
            kot.a(kouVar, null, null);
            arrayList.add(kouVar);
        }
        kox$$ExternalSyntheticApiModelOutline0.m471m(context.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m())).disableShortcuts((List) Collection.EL.stream(arrayList).map(new Function() { // from class: bdxk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((kou) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: bdxl
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        })), this.c.getString(R.string.shortcut_disabled_for_db_recreate_text));
        kox.a(context).b();
        Iterator it2 = kox.b(context).iterator();
        if (it2.hasNext()) {
            throw null;
        }
        if (ctid.d) {
            Context context2 = this.c;
            kox.e(context2, (List) Collection.EL.stream(kox.c(context2, 8)).map(new Function() { // from class: bdxk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((kou) obj).b;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: bdxl
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            })));
        }
        Context context3 = this.c;
        kox$$ExternalSyntheticApiModelOutline0.m471m(context3.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m())).removeAllDynamicShortcuts();
        kox.a(context3).a();
        Iterator it3 = kox.b(context3).iterator();
        if (it3.hasNext()) {
            throw null;
        }
    }
}
