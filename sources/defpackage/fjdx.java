package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjdx {
    public final Map a = new ConcurrentHashMap();
    final fhfd b;
    final fhgk c;
    final List d;
    final List e;

    public fjdx(fhfd fhfdVar, fhgk fhgkVar, List list, List list2) {
        this.b = fhfdVar;
        this.c = fhgkVar;
        this.d = list;
        this.e = list2;
    }

    public final Object a(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new fjdv(this, cls));
    }

    public final fjbu b(Type type, Annotation[] annotationArr) {
        type.getClass();
        annotationArr.getClass();
        int indexOf = this.d.indexOf(null) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            fjbu a = ((fjbt) this.d.get(i)).a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((fjbt) this.d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final fjbu c(Type type) {
        type.getClass();
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
        }
        return fjbf.a;
    }

    public final fjbu d(Type type, Annotation[] annotationArr) {
        type.getClass();
        annotationArr.getClass();
        int indexOf = this.d.indexOf(null) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            fjbu b = ((fjbt) this.d.get(i)).b(type);
            if (b != null) {
                return b;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((fjbt) this.d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
