package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbqx {
    public static String a(btrw btrwVar, PartsTable.BindData bindData) {
        if (!c(btrwVar)) {
            emxf.a(b(btrwVar));
            fbuk n = btrwVar.n();
            n.getClass();
            fbue fbueVar = n.c == 8 ? (fbue) n.d : fbue.a;
            bindData.K().getClass();
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) bindData.K(), n.h, n.i);
            d(fbueVar.c, sb);
            if ((fbueVar.b & 2) != 0) {
                fbug fbugVar = fbueVar.e;
                if (fbugVar == null) {
                    fbugVar = fbug.a;
                }
                d(fbugVar.b, sb);
                d(fbugVar.f, sb);
                d(fbugVar.c, sb);
            }
            return sb.toString();
        }
        fbuk n2 = btrwVar.n();
        n2.getClass();
        bindData.K().getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) bindData.K(), n2.h, n2.i);
        int i = n2.c;
        fbrx fbrxVar = null;
        if (i == 8) {
            fbue fbueVar2 = (fbue) n2.d;
            if ((fbueVar2.b & 2) != 0) {
                fbug fbugVar2 = fbueVar2.e;
                if (fbugVar2 == null) {
                    fbugVar2 = fbug.a;
                }
                d(fbugVar2.b, sb2);
            }
            if ((fbueVar2.b & 1) != 0 && (fbrxVar = fbueVar2.d) == null) {
                fbrxVar = fbrx.a;
            }
        } else if (i == 7) {
            fbrxVar = (fbrx) n2.d;
        }
        if (fbrxVar != null) {
            if ((fbrxVar.b & 2) != 0) {
                fbvj fbvjVar = fbrxVar.d;
                if (fbvjVar == null) {
                    fbvjVar = fbvj.a;
                }
                d(fbvjVar.d, sb2);
            }
            if ((fbrxVar.b & 1) != 0) {
                fbvn fbvnVar = fbrxVar.c;
                if (fbvnVar == null) {
                    fbvnVar = fbvn.a;
                }
                d(fbvnVar.b, sb2);
                d(fbvnVar.g, sb2);
            }
        }
        return sb2.toString();
    }

    public static boolean b(btrw btrwVar) {
        return btrwVar.k() == fbqt.LINK_ANNOTATION.a();
    }

    public static boolean c(btrw btrwVar) {
        if (btrwVar.k() == fbqt.ADDRESS_ANNOTATION.a()) {
            return true;
        }
        if (b(btrwVar)) {
            fbuk n = btrwVar.n();
            n.getClass();
            if (n.c == 8) {
                fbue fbueVar = (fbue) n.d;
                if (cuxu.b(fbueVar.c)) {
                    return true;
                }
                if ((fbueVar.b & 2) != 0) {
                    fbug fbugVar = fbueVar.e;
                    if (fbugVar == null) {
                        fbugVar = fbug.a;
                    }
                    if (cuxu.b(fbugVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static void d(String str, StringBuilder sb) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sb.append(" ");
        sb.append(str);
    }
}
