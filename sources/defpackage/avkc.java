package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avkc {
    private static final cskc a = cskc.g("BugleDataModel", "ChatEndpointFactory");
    private final ctvb b;
    private final cfsk c;

    public avkc(ctvb ctvbVar, cfsk cfskVar) {
        this.b = ctvbVar;
        this.c = cfskVar;
    }

    private final String g(String str) {
        return this.b.y(str, true);
    }

    public final awui a(String str, boolean z) {
        if (z) {
            return e(str);
        }
        cskc cskcVar = cpdg.a;
        if (aoqw.h(str)) {
            return b(str);
        }
        if (this.c.b(str)) {
            return d(str);
        }
        try {
            String g = g(str);
            awuf awufVar = (awuf) awui.a.createBuilder();
            awuh awuhVar = awuh.PHONE;
            awufVar.copyOnWrite();
            awui awuiVar = (awui) awufVar.instance;
            awuiVar.c = awuhVar.f;
            awuiVar.b |= 1;
            awufVar.copyOnWrite();
            awui awuiVar2 = (awui) awufVar.instance;
            g.getClass();
            awuiVar2.b |= 2;
            awuiVar2.d = g;
            return (awui) awufVar.build();
        } catch (IllegalArgumentException e) {
            throw avkg.a(str, e);
        }
    }

    public final awui b(String str) {
        cskc cskcVar = cpdg.a;
        if (!aoqw.h(str)) {
            throw new avkg(String.format("%s is not a valid bot id.", str));
        }
        awuf awufVar = (awuf) awui.a.createBuilder();
        awuh awuhVar = awuh.BOT;
        awufVar.copyOnWrite();
        awui awuiVar = (awui) awufVar.instance;
        awuiVar.c = awuhVar.f;
        awuiVar.b = 1 | awuiVar.b;
        awufVar.copyOnWrite();
        awui awuiVar2 = (awui) awufVar.instance;
        str.getClass();
        awuiVar2.b |= 2;
        awuiVar2.d = str;
        return (awui) awufVar.build();
    }

    public final awui c(String str) {
        if (!this.b.I(str)) {
            throw avkg.a(str, new IllegalArgumentException("Provided endpoint is not a valid E164 number"));
        }
        awuf awufVar = (awuf) awui.a.createBuilder();
        awuh awuhVar = awuh.PHONE;
        awufVar.copyOnWrite();
        awui awuiVar = (awui) awufVar.instance;
        awuiVar.c = awuhVar.f;
        awuiVar.b |= 1;
        awufVar.copyOnWrite();
        awui awuiVar2 = (awui) awufVar.instance;
        str.getClass();
        awuiVar2.b |= 2;
        awuiVar2.d = str;
        return (awui) awufVar.build();
    }

    public final awui d(String str) {
        awuf awufVar = (awuf) awui.a.createBuilder();
        awuh awuhVar = awuh.EMERGENCY;
        awufVar.copyOnWrite();
        awui awuiVar = (awui) awufVar.instance;
        awuiVar.c = awuhVar.f;
        awuiVar.b |= 1;
        awufVar.copyOnWrite();
        awui awuiVar2 = (awui) awufVar.instance;
        str.getClass();
        awuiVar2.b |= 2;
        awuiVar2.d = str;
        return (awui) awufVar.build();
    }

    public final awui e(String str) {
        if (str.isEmpty()) {
            throw new avkg("Group endpoint must have a conference URI");
        }
        awuf awufVar = (awuf) awui.a.createBuilder();
        awuh awuhVar = awuh.GROUP;
        awufVar.copyOnWrite();
        awui awuiVar = (awui) awufVar.instance;
        awuiVar.c = awuhVar.f;
        awuiVar.b |= 1;
        awufVar.copyOnWrite();
        awui awuiVar2 = (awui) awufVar.instance;
        str.getClass();
        awuiVar2.b |= 2;
        awuiVar2.d = str;
        return (awui) awufVar.build();
    }

    public final awui f(aoku aokuVar, String str) {
        if (aokuVar.e().isPresent()) {
            awui awuiVar = (awui) aokuVar.e().get();
            awuh awuhVar = awuh.PHONE;
            awuh b = awuh.b(awuiVar.c);
            if (b == null) {
                b = awuh.UNKNOWN_TYPE;
            }
            if (awuhVar.equals(b)) {
                return awuiVar;
            }
        }
        try {
            g(str);
        } catch (IllegalArgumentException unused) {
            csjb e = a.e();
            e.I("Creating ChatEndpoint with non E164 format");
            e.k(str);
            e.r();
        }
        awuf awufVar = (awuf) awui.a.createBuilder();
        awuh awuhVar2 = awuh.PHONE;
        awufVar.copyOnWrite();
        awui awuiVar2 = (awui) awufVar.instance;
        awuiVar2.c = awuhVar2.f;
        awuiVar2.b |= 1;
        awufVar.copyOnWrite();
        awui awuiVar3 = (awui) awufVar.instance;
        str.getClass();
        awuiVar3.b |= 2;
        awuiVar3.d = str;
        return (awui) awufVar.build();
    }
}
