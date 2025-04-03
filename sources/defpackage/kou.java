package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kou {
    public Context a;
    public String b;
    public Intent[] c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public IconCompat h;
    public knr[] i;
    public Set j;
    public koo k;
    public boolean l;
    public int m;
    public PersistableBundle n;

    static List a(Context context, List list) {
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
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
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
                int i = extras.getInt("extraPersonCount");
                knrVarArr = new knr[i];
                int i2 = 0;
                while (i2 < i) {
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                    knq knqVar = new knq();
                    knqVar.a = persistableBundle.getString("name");
                    knqVar.c = persistableBundle.getString(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                    knqVar.d = persistableBundle.getString("key");
                    knqVar.e = persistableBundle.getBoolean("isBot");
                    knqVar.f = persistableBundle.getBoolean("isImportant");
                    knrVarArr[i2] = new knr(knqVar);
                    i2 = i3;
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
        return arrayList;
    }
}
