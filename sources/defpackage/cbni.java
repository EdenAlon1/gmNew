package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbni {
    public abstract int a();

    public abstract long b();

    public abstract ConversationIdType c();

    public abstract MessageIdType d();

    public abstract fbuk e();

    public abstract fbuk f();

    public abstract Optional g();

    public abstract Long h();

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public abstract String n();

    public abstract String o();

    public abstract String p();

    public abstract boolean q();

    public abstract boolean r();

    public final fbrx s() {
        fbuk e = e();
        fbrx fbrxVar = null;
        if (e != null) {
            fbqt b = fbqt.b(e.e);
            if (b == null) {
                b = fbqt.UNRECOGNIZED;
            }
            if (b == fbqt.ADDRESS_ANNOTATION) {
                emxf.l(e.c == 7);
                fbrxVar = e.c == 7 ? (fbrx) e.d : fbrx.a;
            }
        }
        fbue t = t();
        if (t == null || (1 & t.b) == 0) {
            return fbrxVar;
        }
        if (fbrxVar == null) {
            fbrx fbrxVar2 = t.d;
            return fbrxVar2 == null ? fbrx.a : fbrxVar2;
        }
        fbrw fbrwVar = (fbrw) fbrxVar.toBuilder();
        fbrx fbrxVar3 = t.d;
        if (fbrxVar3 == null) {
            fbrxVar3 = fbrx.a;
        }
        fbrwVar.mergeFrom((fbrw) fbrxVar3);
        return (fbrx) fbrwVar.build();
    }

    public final fbue t() {
        fbug fbugVar;
        String m = m();
        String l = l();
        String k = k();
        if (TextUtils.isEmpty(m) || TextUtils.isEmpty(l) || TextUtils.isEmpty(k)) {
            fbugVar = null;
        } else {
            Long h = h();
            fbuf fbufVar = (fbuf) fbug.a.createBuilder();
            fbufVar.copyOnWrite();
            fbug fbugVar2 = (fbug) fbufVar.instance;
            m.getClass();
            fbugVar2.b = m;
            fbufVar.copyOnWrite();
            fbug fbugVar3 = (fbug) fbufVar.instance;
            l.getClass();
            fbugVar3.d = l;
            fbufVar.copyOnWrite();
            fbug fbugVar4 = (fbug) fbufVar.instance;
            k.getClass();
            fbugVar4.c = k;
            long longValue = h != null ? h.longValue() : 0L;
            fbufVar.copyOnWrite();
            ((fbug) fbufVar.instance).e = longValue;
            fbugVar = (fbug) fbufVar.build();
        }
        fbuk f = f();
        if (f != null) {
            fbqt b = fbqt.b(f.e);
            if (b == null) {
                b = fbqt.UNRECOGNIZED;
            }
            if (b == fbqt.LINK_ANNOTATION) {
                emxf.l(f.c == 8);
                fbue fbueVar = f.c == 8 ? (fbue) f.d : fbue.a;
                if ((fbueVar.b & 2) != 0 || fbugVar == null) {
                    return fbueVar;
                }
                fbud fbudVar = (fbud) fbueVar.toBuilder();
                fbudVar.copyOnWrite();
                fbue fbueVar2 = (fbue) fbudVar.instance;
                fbueVar2.e = fbugVar;
                fbueVar2.b |= 2;
                return (fbue) fbudVar.build();
            }
        }
        if (fbugVar == null) {
            return null;
        }
        fbud fbudVar2 = (fbud) fbue.a.createBuilder();
        String n = n();
        n.getClass();
        fbudVar2.copyOnWrite();
        ((fbue) fbudVar2.instance).c = n;
        fbudVar2.copyOnWrite();
        fbue fbueVar3 = (fbue) fbudVar2.instance;
        fbueVar3.e = fbugVar;
        fbueVar3.b |= 2;
        return (fbue) fbudVar2.build();
    }

    public final fbug u() {
        fbue t = t();
        if (t == null || (t.b & 2) == 0) {
            return null;
        }
        fbug fbugVar = t.e;
        return fbugVar == null ? fbug.a : fbugVar;
    }

    public final String v() {
        fbue t = t();
        return (t == null || t.c.isEmpty()) ? n() : t.c;
    }
}
