package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ysk {
    private static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutsConfigurationProvider");
    private final Map b;
    private final Context c;
    private final ffbr d;
    private final ysb e;
    private final aklo f;

    public ysk(Map map, Context context, aklo akloVar, @asgu ffbr ffbrVar, ysb ysbVar) {
        map.getClass();
        context.getClass();
        akloVar.getClass();
        ffbrVar.getClass();
        this.b = map;
        this.c = context;
        this.f = akloVar;
        this.d = ffbrVar;
        this.e = ysbVar;
    }

    private final void e(List list, yrz yrzVar) {
        ysi ysiVar = (ysi) this.b.get(yrzVar.getClass());
        if (ysiVar == null) {
            return;
        }
        yrp a2 = this.f.a(ysiVar, yrzVar);
        if (!a2.e()) {
            ensk e = a.e();
            e.Y(ente.a, "BugleComposeRow2");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutsConfigurationProvider", "addShortcut", 107, "ShortcutsConfigurationProvider.kt")).t("Hiding %s shortcut.", this.c.getString(a2.a()));
        } else {
            ensk e2 = a.e();
            e2.Y(ente.a, "BugleComposeRow2");
            ((enrr) e2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutsConfigurationProvider", "addShortcut", 104, "ShortcutsConfigurationProvider.kt")).t("Showing %s shortcut.", this.c.getString(a2.a()));
            list.add(yse.c(a2, this.c));
        }
    }

    public final dsat a(List list) {
        list.getClass();
        Integer b = this.e.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yrz yrzVar = (yrz) it.next();
            ysi ysiVar = (ysi) this.b.get(yrzVar.getClass());
            dsar dsarVar = null;
            if (ysiVar != null) {
                yrp a2 = this.f.a(ysiVar, yrzVar);
                if (a2.e()) {
                    ensk e = a.e();
                    e.Y(ente.a, "BugleComposeRow2");
                    ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutsConfigurationProvider", "toHugoShortcutIfHandlerIsEnabled", 90, "ShortcutsConfigurationProvider.kt")).t("Showing %s shortcut.", this.c.getString(a2.a()));
                    dsarVar = yse.c(a2, this.c);
                } else {
                    ensk e2 = a.e();
                    e2.Y(ente.a, "BugleComposeRow2");
                    ((enrr) e2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutsConfigurationProvider", "toHugoShortcutIfHandlerIsEnabled", 93, "ShortcutsConfigurationProvider.kt")).t("Hiding %s shortcut.", this.c.getString(a2.a()));
                }
            }
            if (dsarVar != null) {
                arrayList.add(dsarVar);
            }
        }
        return new dsat(arrayList, b);
    }

    @ffbs
    public final dsat b(boolean z) {
        Integer b = this.e.b();
        fffs fffsVar = new fffs((byte[]) null);
        if (!z) {
            e(fffsVar, yrs.a);
            e(fffsVar, yrt.a);
            e(fffsVar, yry.a);
            e(fffsVar, yrv.a);
            e(fffsVar, yrr.a);
        }
        e(fffsVar, yru.a);
        if (!z) {
            e(fffsVar, yrq.a);
            e(fffsVar, yrw.a);
            if (((Boolean) this.d.b()).booleanValue()) {
                e(fffsVar, yrx.a);
            }
        }
        return new dsat(ffdx.a(fffsVar), b);
    }

    public final List c() {
        fffs fffsVar = new fffs((byte[]) null);
        fffsVar.add(yrs.a);
        fffsVar.add(yrt.a);
        fffsVar.add(yry.a);
        fffsVar.add(yrv.a);
        fffsVar.add(yrr.a);
        fffsVar.add(yru.a);
        fffsVar.add(yrq.a);
        fffsVar.add(yrw.a);
        if (((Boolean) this.d.b()).booleanValue()) {
            fffsVar.add(yrx.a);
        }
        return ffdx.a(fffsVar);
    }
}
