package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erkv {
    public static erhv a(Throwable th, boolean z) {
        erhv erhvVar = (erhv) eria.a.createBuilder();
        erhr erhrVar = (erhr) erhu.a.createBuilder();
        erhrVar.copyOnWrite();
        erhu erhuVar = (erhu) erhrVar.instance;
        erhuVar.b |= 1;
        erhuVar.c = "";
        erhvVar.copyOnWrite();
        eria eriaVar = (eria) erhvVar.instance;
        erhu erhuVar2 = (erhu) erhrVar.build();
        erhuVar2.getClass();
        eriaVar.e = erhuVar2;
        eriaVar.b |= 1;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(th);
        identityHashMap.put(th, 0);
        arrayList.add(b(th, z));
        while (!arrayDeque.isEmpty()) {
            Throwable th2 = (Throwable) arrayDeque.remove();
            Integer num = (Integer) identityHashMap.get(th2);
            num.getClass();
            int intValue = num.intValue();
            if (th2.getCause() != null) {
                Throwable cause = th2.getCause();
                if (!identityHashMap.containsKey(cause)) {
                    identityHashMap.put(cause, Integer.valueOf(identityHashMap.size()));
                    arrayList.add(b(cause, z));
                    arrayDeque.add(cause);
                }
                erhy erhyVar = (erhy) arrayList.get(intValue);
                int intValue2 = ((Integer) identityHashMap.get(cause)).intValue();
                erhyVar.copyOnWrite();
                erhz erhzVar = (erhz) erhyVar.instance;
                erhz erhzVar2 = erhz.a;
                erhzVar.b |= 2;
                erhzVar.d = intValue2;
            }
            for (Throwable th3 : th2.getSuppressed()) {
                if (!identityHashMap.containsKey(th3)) {
                    identityHashMap.put(th3, Integer.valueOf(identityHashMap.size()));
                    arrayList.add(b(th3, z));
                    arrayDeque.add(th3);
                }
                erhy erhyVar2 = (erhy) arrayList.get(intValue);
                int intValue3 = ((Integer) identityHashMap.get(th3)).intValue();
                erhyVar2.copyOnWrite();
                erhz erhzVar3 = (erhz) erhyVar2.instance;
                erhz erhzVar4 = erhz.a;
                eygi eygiVar = erhzVar3.e;
                if (!eygiVar.c()) {
                    erhzVar3.e = eyfy.mutableCopy(eygiVar);
                }
                erhzVar3.e.h(intValue3);
            }
        }
        erhw erhwVar = (erhw) erhx.a.createBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            erhy erhyVar3 = (erhy) arrayList.get(i);
            erhwVar.copyOnWrite();
            erhx erhxVar = (erhx) erhwVar.instance;
            erhz erhzVar5 = (erhz) erhyVar3.build();
            erhzVar5.getClass();
            erhxVar.a();
            erhxVar.b.add(erhzVar5);
        }
        erhvVar.copyOnWrite();
        eria eriaVar2 = (eria) erhvVar.instance;
        erhx erhxVar2 = (erhx) erhwVar.build();
        erhxVar2.getClass();
        eriaVar2.d = erhxVar2;
        eriaVar2.c = 4;
        return erhvVar;
    }

    public static erhy b(Throwable th, boolean z) {
        erhy erhyVar = (erhy) erhz.a.createBuilder();
        erhr d = d(th, z);
        erhyVar.copyOnWrite();
        erhz erhzVar = (erhz) erhyVar.instance;
        erhu erhuVar = (erhu) d.build();
        erhuVar.getClass();
        erhzVar.c = erhuVar;
        erhzVar.b |= 1;
        return erhyVar;
    }

    public static erhv c(Throwable th) {
        erhv erhvVar = (erhv) eria.a.createBuilder();
        erhr d = d(th, false);
        erhvVar.copyOnWrite();
        eria eriaVar = (eria) erhvVar.instance;
        erhu erhuVar = (erhu) d.build();
        erhuVar.getClass();
        eriaVar.e = erhuVar;
        eriaVar.b |= 1;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return erhvVar;
            }
            erhr d2 = d(th, false);
            erhvVar.copyOnWrite();
            eria eriaVar2 = (eria) erhvVar.instance;
            erhu erhuVar2 = (erhu) d2.build();
            erhuVar2.getClass();
            eriaVar2.a();
            eriaVar2.f.add(erhuVar2);
        }
    }

    private static erhr d(Throwable th, boolean z) {
        StackTraceElement[] stackTraceElementArr;
        erhr erhrVar = (erhr) erhu.a.createBuilder();
        String name = th.getClass().getName();
        erhrVar.copyOnWrite();
        erhu erhuVar = (erhu) erhrVar.instance;
        name.getClass();
        erhuVar.b |= 1;
        erhuVar.c = name;
        if (z && th.getMessage() != null) {
            String message = th.getMessage();
            erhrVar.copyOnWrite();
            erhu erhuVar2 = (erhu) erhrVar.instance;
            message.getClass();
            erhuVar2.b |= 2;
            erhuVar2.d = message;
        }
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTraceElementArr = null;
        }
        if (stackTraceElementArr != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                erhs erhsVar = (erhs) erht.a.createBuilder();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    erhsVar.copyOnWrite();
                    erht erhtVar = (erht) erhsVar.instance;
                    className.getClass();
                    erhtVar.b |= 1;
                    erhtVar.c = className;
                    String methodName = stackTraceElement.getMethodName();
                    erhsVar.copyOnWrite();
                    erht erhtVar2 = (erht) erhsVar.instance;
                    methodName.getClass();
                    erhtVar2.b |= 2;
                    erhtVar2.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    erhsVar.copyOnWrite();
                    erht erhtVar3 = (erht) erhsVar.instance;
                    erhtVar3.b |= 8;
                    erhtVar3.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        erhsVar.copyOnWrite();
                        erht erhtVar4 = (erht) erhsVar.instance;
                        fileName.getClass();
                        erhtVar4.b |= 4;
                        erhtVar4.e = fileName;
                    }
                }
                erhrVar.copyOnWrite();
                erhu erhuVar3 = (erhu) erhrVar.instance;
                erht erhtVar5 = (erht) erhsVar.build();
                erhtVar5.getClass();
                eygr eygrVar = erhuVar3.f;
                if (!eygrVar.c()) {
                    erhuVar3.f = eyfy.mutableCopy(eygrVar);
                }
                erhuVar3.f.add(erhtVar5);
            }
        }
        return erhrVar;
    }
}
