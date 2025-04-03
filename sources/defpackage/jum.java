package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jum extends ffkk implements ffji {
    final /* synthetic */ juk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jum(juk jukVar) {
        super(1);
        this.a = jukVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        String concat;
        juk jukVar = (juk) obj;
        if (jukVar instanceof juc) {
            StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
            juc jucVar = (juc) jukVar;
            sb.append(jucVar.b().length());
            sb.append(", newCursorPosition=");
            sb.append(jucVar.a);
            sb.append(')');
            concat = sb.toString();
        } else if (jukVar instanceof jvq) {
            StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
            jvq jvqVar = (jvq) jukVar;
            sb2.append(jvqVar.b().length());
            sb2.append(", newCursorPosition=");
            sb2.append(jvqVar.a);
            sb2.append(')');
            concat = sb2.toString();
        } else if (jukVar instanceof jvp) {
            concat = jukVar.toString();
        } else if (jukVar instanceof jui) {
            concat = jukVar.toString();
        } else if (jukVar instanceof juj) {
            concat = jukVar.toString();
        } else if (jukVar instanceof jvr) {
            concat = jukVar.toString();
        } else if (jukVar instanceof juq) {
            concat = jukVar.toString();
        } else if (jukVar instanceof jub) {
            concat = jukVar.toString();
        } else if (jukVar instanceof jvc) {
            concat = jukVar.toString();
        } else if (jukVar instanceof juh) {
            concat = jukVar.toString();
        } else {
            Class<?> cls = jukVar.getClass();
            int i = fflc.a;
            String c = new ffkb(cls).c();
            if (c == null) {
                c = "{anonymous EditCommand}";
            }
            concat = "Unknown EditCommand: ".concat(c);
        }
        return (this.a == jukVar ? " > " : "   ").concat(String.valueOf(concat));
    }
}
