package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class ews extends ffkh implements ffji {
    public ews(Object obj) {
        super(1, obj, ewr.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        int a;
        Integer valueOf;
        KeyEvent keyEvent = ((iix) obj).a;
        ewr ewrVar = (ewr) this.g;
        boolean z = true;
        juc jucVar = null;
        if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
            euc eucVar = ewrVar.h;
            int unicodeChar = keyEvent.getUnicodeChar();
            if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                eucVar.a = Integer.valueOf(unicodeChar & Alert.DURATION_SHOW_INDEFINITELY);
                valueOf = null;
            } else {
                Integer num = eucVar.a;
                if (num != null) {
                    eucVar.a = null;
                    valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar));
                    if (valueOf.intValue() == 0) {
                        valueOf = null;
                    }
                    if (valueOf == null) {
                        valueOf = Integer.valueOf(unicodeChar);
                    }
                } else {
                    valueOf = Integer.valueOf(unicodeChar);
                }
            }
            if (valueOf != null) {
                jucVar = new juc(new StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
            }
        }
        if (jucVar != null) {
            ewrVar.a(jucVar);
            ewrVar.e.a();
        } else if (iiy.a(iiz.a(keyEvent), 2) && (a = ewrVar.i.a(keyEvent)) != 0) {
            ffkx ffkxVar = new ffkx();
            ffkxVar.a = true;
            ewq ewqVar = new ewq(a, ewrVar, ffkxVar);
            fgq fgqVar = new fgq(ewrVar.c, ewrVar.f, ewrVar.a.d(), ewrVar.e);
            ewqVar.invoke(fgqVar);
            if (!jpm.h(fgqVar.c, ewrVar.c.c) || !ffkj.e(fgqVar.d, ewrVar.c.b)) {
                ewrVar.j.invoke(fgqVar.y());
            }
            eyo eyoVar = ewrVar.g;
            if (eyoVar != null) {
                eyoVar.a();
            }
            z = ffkxVar.a;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
