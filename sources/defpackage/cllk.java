package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllk {
    public static awui a(clns clnsVar, clqv clqvVar) {
        awuh awuhVar;
        awuf awufVar = (awuf) awui.a.createBuilder();
        int i = clqvVar.b;
        int a = clqu.a(i);
        if (a == 0) {
            throw null;
        }
        int i2 = a - 1;
        if (i2 == 0) {
            String str = (i == 1 ? (clqq) clqvVar.c : clqq.a).c;
            awufVar.copyOnWrite();
            awui awuiVar = (awui) awufVar.instance;
            str.getClass();
            awuiVar.b |= 2;
            awuiVar.d = str;
        } else {
            if (i2 != 1) {
                throw new IllegalArgumentException("Conversation type not supported");
            }
            String str2 = (i == 2 ? (cltf) clqvVar.c : cltf.a).c;
            awufVar.copyOnWrite();
            awui awuiVar2 = (awui) awufVar.instance;
            str2.getClass();
            awuiVar2.b |= 2;
            awuiVar2.d = str2;
            int a2 = clnr.a(clnsVar.c);
            if (a2 != 0 && a2 == 4) {
                if (str2.startsWith("sip")) {
                    str2 = str2.substring(4);
                }
                int indexOf = str2.indexOf(59);
                if (indexOf >= 0) {
                    str2 = str2.substring(0, indexOf);
                }
                awufVar.copyOnWrite();
                awui awuiVar3 = (awui) awufVar.instance;
                str2.getClass();
                awuiVar3.b |= 2;
                awuiVar3.d = str2;
            }
        }
        int i3 = clqvVar.b;
        if (i3 == 1) {
            awuhVar = awuh.PHONE;
        } else {
            if (i3 == 2) {
                int i4 = clnsVar.c;
                int a3 = clnr.a(i4);
                if (a3 != 0 && a3 == 4) {
                    awuhVar = awuh.BOT;
                } else {
                    int a4 = clnr.a(i4);
                    if (a4 != 0 && a4 == 3) {
                        awuhVar = awuh.GROUP;
                    }
                }
            }
            awuhVar = awuh.UNKNOWN_TYPE;
        }
        awufVar.copyOnWrite();
        awui awuiVar4 = (awui) awufVar.instance;
        awuiVar4.c = awuhVar.f;
        awuiVar4.b |= 1;
        return (awui) awufVar.build();
    }

    public static clqv b(awui awuiVar) {
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        int ordinal = b.ordinal();
        if (ordinal == 1) {
            clqt clqtVar = (clqt) clqv.a.createBuilder();
            clqp clqpVar = (clqp) clqq.a.createBuilder();
            String str = awuiVar.d;
            clqpVar.copyOnWrite();
            clqq clqqVar = (clqq) clqpVar.instance;
            str.getClass();
            clqqVar.b |= 1;
            clqqVar.c = str;
            clqtVar.copyOnWrite();
            clqv clqvVar = (clqv) clqtVar.instance;
            clqq clqqVar2 = (clqq) clqpVar.build();
            clqqVar2.getClass();
            clqvVar.c = clqqVar2;
            clqvVar.b = 1;
            return (clqv) clqtVar.build();
        }
        if (ordinal != 2 && ordinal != 3) {
            if (ordinal == 4) {
                throw new UnsupportedOperationException("Emergency ChatEndpoint to RcsDestinationId not yet supported.");
            }
            awuh b2 = awuh.b(awuiVar.c);
            if (b2 == null) {
                b2 = awuh.UNKNOWN_TYPE;
            }
            throw new IllegalArgumentException("ChatEndpoint type not supported: " + b2.f);
        }
        clqt clqtVar2 = (clqt) clqv.a.createBuilder();
        clte clteVar = (clte) cltf.a.createBuilder();
        String str2 = awuiVar.d;
        clteVar.copyOnWrite();
        cltf cltfVar = (cltf) clteVar.instance;
        str2.getClass();
        cltfVar.b = 1 | cltfVar.b;
        cltfVar.c = str2;
        clqtVar2.copyOnWrite();
        clqv clqvVar2 = (clqv) clqtVar2.instance;
        cltf cltfVar2 = (cltf) clteVar.build();
        cltfVar2.getClass();
        clqvVar2.c = cltfVar2;
        clqvVar2.b = 2;
        return (clqv) clqtVar2.build();
    }
}
