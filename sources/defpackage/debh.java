package defpackage;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Size;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class debh extends csll {
    public static final cskc a = cskc.g("Bugle", "ShortcutUtilImpl");
    private static boolean k;
    public final ffbr b;
    public final ffbr c;
    public final Context d;
    public int e;
    public final cqoh f;
    public final ffbr g;
    public final errm h;
    public final ffbr i;
    int j = 0;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final errl o;
    private final errl p;
    private final Optional q;
    private final ffbr r;
    private final cuay s;

    public debh(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, Context context, ffbr ffbrVar4, cqoh cqohVar, ffbr ffbrVar5, ffbr ffbrVar6, errl errlVar, errl errlVar2, errm errmVar, Optional optional, ffbr ffbrVar7, cuay cuayVar, ffbr ffbrVar8) {
        this.l = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = context;
        this.m = ffbrVar4;
        this.f = cqohVar;
        this.n = ffbrVar5;
        this.g = ffbrVar6;
        this.o = errlVar;
        this.p = errlVar2;
        this.h = errmVar;
        this.q = optional;
        this.r = ffbrVar7;
        this.s = cuayVar;
        this.i = ffbrVar8;
    }

    @Override // defpackage.csll
    public final ShortcutInfo a(Context context, ConversationId conversationId, String str, aoku aokuVar, IconCompat iconCompat, String str2, int i, boolean z) {
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intents;
        int length;
        ShortcutInfo build;
        int length2;
        kou c = this.s.c(context, conversationId, o(str, aokuVar), iconCompat, str2, i, z);
        shortLabel = new ShortcutInfo.Builder(c.a, c.b).setShortLabel(c.e);
        intents = shortLabel.setIntents(c.c);
        IconCompat iconCompat2 = c.h;
        if (iconCompat2 != null) {
            intents.setIcon(kqk.c(iconCompat2, c.a));
        }
        if (!TextUtils.isEmpty(c.f)) {
            intents.setLongLabel(c.f);
        }
        if (!TextUtils.isEmpty(c.g)) {
            intents.setDisabledMessage(c.g);
        }
        ComponentName componentName = c.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set set = c.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(c.m);
        PersistableBundle persistableBundle = c.n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            knr[] knrVarArr = c.i;
            if (knrVarArr != null && (length2 = knrVarArr.length) > 0) {
                Person[] personArr = new Person[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    personArr[i2] = knp.a(c.i[i2]);
                }
                intents.setPersons(personArr);
            }
            koo kooVar = c.k;
            if (kooVar != null) {
                intents.setLocusId(kooVar.b);
            }
            intents.setLongLived(c.l);
        } else {
            if (c.n == null) {
                c.n = new PersistableBundle();
            }
            knr[] knrVarArr2 = c.i;
            if (knrVarArr2 != null && (length = knrVarArr2.length) > 0) {
                c.n.putInt("extraPersonCount", length);
                int i3 = 0;
                while (i3 < c.i.length) {
                    PersistableBundle persistableBundle2 = c.n;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i4 = i3 + 1;
                    sb.append(i4);
                    String sb2 = sb.toString();
                    knr knrVar = c.i[i3];
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = knrVar.a;
                    persistableBundle3.putString("name", charSequence != null ? charSequence.toString() : null);
                    persistableBundle3.putString(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, knrVar.c);
                    persistableBundle3.putString("key", knrVar.d);
                    persistableBundle3.putBoolean("isBot", knrVar.e);
                    persistableBundle3.putBoolean("isImportant", knrVar.f);
                    persistableBundle2.putPersistableBundle(sb2, persistableBundle3);
                    i3 = i4;
                }
            }
            koo kooVar2 = c.k;
            if (kooVar2 != null) {
                c.n.putString("extraLocusId", kooVar2.a);
            }
            c.n.putBoolean("extraLongLived", c.l);
            intents.setExtras(c.n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            intents.setExcludedFromSurfaces(0);
        }
        build = intents.build();
        return build;
    }

    @Override // defpackage.csll
    public final ConversationId b(String str) {
        List dynamicShortcuts;
        Intent intent;
        String id;
        ShortcutManager m471m = kox$$ExternalSyntheticApiModelOutline0.m471m(this.d.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m()));
        if (m471m != null) {
            dynamicShortcuts = m471m.getDynamicShortcuts();
            Iterator it = dynamicShortcuts.iterator();
            while (true) {
                if (it.hasNext()) {
                    ShortcutInfo m = kox$$ExternalSyntheticApiModelOutline0.m(it.next());
                    intent = m.getIntent();
                    id = m.getId();
                    if (id.equals(str) && intent != null) {
                        ConversationId a2 = ((amet) this.r.b()).a(intent);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                } else if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
                    return new BugleConversationId(str);
                }
            }
        }
        return InvalidConversationId.a;
    }

    @Override // defpackage.csll
    public final elfl c(final ConversationId conversationId, final String str, final aoku aokuVar, final String str2, final boolean z) {
        return !ctid.d ? elfo.e(false) : elfo.g(new Callable() { // from class: deaz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cskc cskcVar = debh.a;
                bsob e = bsom.e();
                e.z("createShortcut");
                e.g(new Function() { // from class: debg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cskc cskcVar2 = debh.a;
                        return ((bskp) obj).t;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final ConversationId conversationId2 = ConversationId.this;
                e.i(new Function() { // from class: dear
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsol bsolVar = (bsol) obj;
                        cskc cskcVar2 = debh.a;
                        bsolVar.q(bdgq.b(ConversationId.this.b()));
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bseh bsehVar = (bseh) ((bskr) e.b().o()).cS();
                if (bsehVar != null) {
                    return bsehVar.W();
                }
                return null;
            }
        }, this.p).i(new eroh() { // from class: debc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                debh debhVar = debh.this;
                Context context = debhVar.d;
                ConversationId conversationId2 = conversationId;
                String str3 = str;
                String str4 = str2;
                return debhVar.n(context, conversationId2, str3, aokuVar, (String) obj, amny.b, -1, str4, 2147483646, z);
            }
        }, this.h).i(new eroh() { // from class: debd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ShortcutInfo m = kox$$ExternalSyntheticApiModelOutline0.m(obj);
                if (m == null) {
                    return elfo.e(false);
                }
                debh debhVar = debh.this;
                kox$$ExternalSyntheticApiModelOutline0.m471m(debhVar.d.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m())).pushDynamicShortcut(m);
                return elfo.e(true);
            }
        }, this.h);
    }

    @Override // defpackage.csll
    public final elfl d(String str, final Context context, boolean z, int i) {
        if (str == null) {
            return elfo.e(null);
        }
        this.q.isPresent();
        if (!z) {
            return elfo.e(IconCompat.h(context, cggq.a(i)));
        }
        final Uri parse = Uri.parse(str);
        final int color = ((crjx) this.n.b()).g() ? context.getColor(R.color.adaptive_background_color_dark) : context.getColor(R.color.adaptive_background_color_light);
        return elfo.g(new Callable() { // from class: debf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                debh debhVar = debh.this;
                crpr crprVar = (crpr) debhVar.c.b();
                int width = debhVar.m().getWidth();
                int height = debhVar.m().getHeight();
                Context context2 = context;
                Bitmap b = crprVar.b(context2, parse, width, height, color, false);
                if (b == null) {
                    return null;
                }
                crpr crprVar2 = (crpr) debhVar.c.b();
                int width2 = b.getWidth() / 4;
                int height2 = b.getHeight() / 4;
                Bitmap createBitmap = Bitmap.createBitmap(b.getWidth() + width2 + width2, b.getHeight() + height2 + height2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(((crjx) crprVar2.a.b()).g() ? context2.getColor(R.color.adaptive_background_color_dark) : context2.getColor(R.color.adaptive_background_color_light));
                canvas.drawBitmap(b, width2, height2, (Paint) null);
                ksq.a(createBitmap);
                IconCompat iconCompat = new IconCompat(5);
                iconCompat.c = createBitmap;
                return iconCompat;
            }
        }, this.o);
    }

    @Override // defpackage.csll
    public final String e(String str) {
        List dynamicShortcuts;
        PersistableBundle extras;
        String id;
        ShortcutManager m471m = kox$$ExternalSyntheticApiModelOutline0.m471m(this.d.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m()));
        if (m471m == null) {
            return null;
        }
        dynamicShortcuts = m471m.getDynamicShortcuts();
        Iterator it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            ShortcutInfo m = kox$$ExternalSyntheticApiModelOutline0.m(it.next());
            extras = m.getExtras();
            id = m.getId();
            if (id.equals(str) && extras != null) {
                return extras.getString("conversation_id");
            }
        }
        if (TextUtils.isEmpty(str) || !TextUtils.isDigitsOnly(str)) {
            return null;
        }
        return str;
    }

    @Override // defpackage.csll
    public final String f(ConversationIdType conversationIdType) {
        return this.s.a(conversationIdType);
    }

    @Override // defpackage.csll
    public final void g(final Context context, final String str) {
        elfr.l(this.p.submit(eldl.l(new Runnable() { // from class: deav
            @Override // java.lang.Runnable
            public final void run() {
                kox$$ExternalSyntheticApiModelOutline0.m471m(context.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m())).reportShortcutUsed(str);
                debh.this.j++;
            }
        })), new csvw(new Consumer() { // from class: deaw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                debh.a.m("Report shortcut used completed successfully");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: deax
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                debh.a.s("Unable to successfully report shortcut used", (Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), erpp.a);
    }

    @Override // defpackage.csll
    public final void h(Context context) {
        g(context, "manifest-shortcut-new_message");
    }

    @Override // defpackage.csll
    public final void i() {
        k = true;
    }

    @Override // defpackage.csll
    public final void j() {
        if (k) {
            k = false;
            bapf bapfVar = (bapf) this.l.b();
            Context context = (Context) bapfVar.a.b();
            context.getClass();
            Optional optional = (Optional) bapfVar.b.b();
            optional.getClass();
            bcqg bcqgVar = (bcqg) bapfVar.c.b();
            bcqgVar.getClass();
            errm errmVar = (errm) bapfVar.d.b();
            errmVar.getClass();
            errm errmVar2 = (errm) bapfVar.f.b();
            errmVar2.getClass();
            new RebuildShortcutsAction(context, optional, bcqgVar, errmVar, bapfVar.e, errmVar2).K();
        }
    }

    @Override // defpackage.csll
    public final boolean k(String str) {
        return this.s.b(str);
    }

    @Override // defpackage.csll
    public final elfl l() {
        a.p("Starting rebuild shortcuts v2");
        final long epochMilli = this.f.f().toEpochMilli();
        return elfo.g(new Callable() { // from class: deas
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List pinnedShortcuts;
                List dynamicShortcuts;
                int i;
                ArrayList arrayList;
                cmj cmjVar;
                List arrayList2;
                List shortcuts;
                String id;
                String id2;
                boolean isDeclaredInManifest;
                String id3;
                debh debhVar = debh.this;
                ShortcutManager m471m = kox$$ExternalSyntheticApiModelOutline0.m471m(debhVar.d.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m()));
                cmj cmjVar2 = new cmj();
                cmj cmjVar3 = new cmj();
                cmj cmjVar4 = new cmj();
                ArrayList arrayList3 = new ArrayList();
                pinnedShortcuts = m471m.getPinnedShortcuts();
                Iterator it = pinnedShortcuts.iterator();
                while (it.hasNext()) {
                    ShortcutInfo m = kox$$ExternalSyntheticApiModelOutline0.m(it.next());
                    id2 = m.getId();
                    if (!cmjVar2.contains(id2)) {
                        isDeclaredInManifest = m.isDeclaredInManifest();
                        if (!isDeclaredInManifest) {
                            id3 = m.getId();
                            cmjVar2.add(id3);
                        }
                    }
                }
                dynamicShortcuts = m471m.getDynamicShortcuts();
                Iterator it2 = dynamicShortcuts.iterator();
                while (it2.hasNext()) {
                    id = kox$$ExternalSyntheticApiModelOutline0.m(it2.next()).getId();
                    cmjVar4.add(id);
                }
                if (ctid.d) {
                    try {
                        shortcuts = m471m.getShortcuts(8);
                        arrayList2 = (List) Collection.EL.stream(shortcuts).map(new Function() { // from class: deaq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                String id4;
                                id4 = kox$$ExternalSyntheticApiModelOutline0.m(obj).getId();
                                return id4;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new Supplier() { // from class: debb
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new ArrayList();
                            }
                        }));
                    } catch (RuntimeException e) {
                        debh.a.s("Failed to get shortcuts: ", e);
                        arrayList2 = new ArrayList();
                    }
                    cmjVar3.addAll(arrayList2);
                }
                bcrs bcrsVar = (bcrs) debhVar.b.b();
                int i2 = debhVar.e;
                if (i2 <= 0) {
                    i2 = m471m.getMaxShortcutCountPerActivity();
                    debhVar.e = i2;
                }
                int i3 = i2;
                engw y = bfks.n().a().l().y();
                int i4 = ((enou) y).c;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (i5 < i4) {
                    int i8 = i3 - 1;
                    bcrsVar.S((bejf) y.get(i5));
                    String f = debhVar.f(bcrsVar.Q());
                    engw engwVar = y;
                    String t = bcrsVar.t();
                    ArrayList arrayList4 = arrayList3;
                    ConversationId O = bcrsVar.O();
                    int i9 = i5;
                    String s = bcrsVar.s();
                    int c = bcrsVar.c();
                    Optional p = bcrsVar.p();
                    boolean W = bcrsVar.W();
                    int i10 = i4;
                    String str = (String) p.map(new Function() { // from class: deba
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            cskc cskcVar = debh.a;
                            cfva cfvaVar = aoqm.a;
                            return ((aoku) obj).p(((Boolean) new aoov().get()).booleanValue());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(null);
                    cmjVar2.remove(f);
                    cmjVar3.remove(f);
                    cmjVar4.remove(f);
                    cmjVar2.remove(debhVar.p(str, t));
                    cmjVar2.remove(debhVar.q(str, t));
                    if (i6 >= i8 || !((cslk) debhVar.g.b()).a(bcrsVar)) {
                        i = i6;
                        arrayList = arrayList4;
                        cmjVar = cmjVar4;
                    } else {
                        cmj cmjVar5 = cmjVar4;
                        Context context = debhVar.d;
                        aoku aokuVar = (aoku) p.orElse(null);
                        i = i6;
                        arrayList = arrayList4;
                        cmjVar = cmjVar5;
                        arrayList.add(debhVar.n(context, O, t, aokuVar, s, bcrsVar.P(), c, f, i7, W));
                        i7++;
                    }
                    i5 = i9 + 1;
                    i6 = i + 1;
                    arrayList3 = arrayList;
                    cmjVar4 = cmjVar;
                    y = engwVar;
                    i4 = i10;
                }
                cmj cmjVar6 = cmjVar4;
                ArrayList arrayList5 = arrayList3;
                if (!cmjVar2.isEmpty()) {
                    debh.a.p("Disabling pinned shortcuts: size=" + cmjVar2.c);
                    m471m.disableShortcuts(enkr.a(cmjVar2));
                }
                if (ctid.d && !cmjVar3.isEmpty()) {
                    debh.a.p("Deleting long lived shortcuts: size=" + cmjVar3.c);
                    m471m.removeLongLivedShortcuts(enkr.a(cmjVar3));
                }
                debh.a.p("Removing dynamic shortcuts: size=" + cmjVar6.c);
                m471m.removeDynamicShortcuts(new ArrayList(cmjVar6));
                return arrayList5;
            }
        }, this.p).i(new eroh() { // from class: deat
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final List list = (List) obj;
                elfn l = elfo.l(list);
                final debh debhVar = debh.this;
                return l.a(new Callable() { // from class: deay
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        debh debhVar2 = debh.this;
                        ShortcutManager m471m = kox$$ExternalSyntheticApiModelOutline0.m471m(debhVar2.d.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m()));
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ShortcutInfo m = kox$$ExternalSyntheticApiModelOutline0.m(erqt.q((elfl) it.next()));
                            if (m != null) {
                                arrayList.add(m);
                            }
                        }
                        debh.a.p("Setting dynamic shortcuts: size=" + arrayList.size());
                        m471m.setDynamicShortcuts(arrayList);
                        return null;
                    }
                }, debhVar.h);
            }
        }, this.h).h(new emwl() { // from class: deau
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                long epochMilli2 = debh.this.f.f().toEpochMilli() - epochMilli;
                debh.a.q("RebuildShortcuts FULL time: " + epochMilli2 + " ms");
                return null;
            }
        }, this.h);
    }

    public final Size m() {
        int iconMaxWidth;
        int iconMaxHeight;
        ShortcutManager m471m = kox$$ExternalSyntheticApiModelOutline0.m471m(this.d.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m()));
        iconMaxWidth = m471m.getIconMaxWidth();
        iconMaxHeight = m471m.getIconMaxHeight();
        if (iconMaxWidth <= 0 || iconMaxHeight <= 0) {
            Context context = this.d;
            iconMaxWidth = context.getResources().getDimensionPixelSize(true != ctid.f(context) ? R.dimen.default_shortcut_icon_size : R.dimen.default_shortcut_icon_size_low_ram);
            iconMaxHeight = iconMaxWidth;
        }
        return new Size(iconMaxWidth, iconMaxHeight);
    }

    public final elfl n(final Context context, final ConversationId conversationId, final String str, final aoku aokuVar, String str2, amny amnyVar, int i, final String str3, final int i2, final boolean z) {
        return d(str2, context, amnyVar == amny.b, i).h(new emwl() { // from class: debe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                IconCompat iconCompat = (IconCompat) obj;
                String str4 = str3;
                debh debhVar = debh.this;
                Context context2 = context;
                int i3 = i2;
                String str5 = str;
                ConversationId conversationId2 = conversationId;
                boolean z2 = z;
                aoku aokuVar2 = aokuVar;
                return debhVar.a(context2, conversationId2, debhVar.o(str5, aokuVar2), aokuVar2, iconCompat, str4, i3, z2);
            }
        }, this.h);
    }

    public final String o(String str, aoku aokuVar) {
        if (TextUtils.isEmpty(str)) {
            str = aokuVar != null ? aokuVar.o() : null;
        }
        return ((cuxh) this.m.b()).c(emxe.b(str));
    }

    @Deprecated
    public final String p(String str, String str2) {
        if (str == null) {
            str = str2;
        }
        return TextUtils.isEmpty(str) ? this.d.getResources().getString(R.string.unknown_sender) : str;
    }

    @Deprecated
    public final String q(String str, String str2) {
        String p = p(str, str2);
        try {
            return Base64.encodeToString(MessageDigest.getInstance("MD5").digest(p.getBytes()), 3);
        } catch (NoSuchAlgorithmException e) {
            a.o("Can't get MD5.", e);
            return p;
        }
    }
}
