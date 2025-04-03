package org.xbill.DNS2;

import defpackage.fiyt;
import defpackage.fiyy;
import defpackage.fjad;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ResolverConfig {
    static Class a;
    static Class b;
    private static ResolverConfig e;
    public String[] servers = null;
    public fiyt[] c = null;
    public int d = -1;

    static {
        ResolverConfig resolverConfig = new ResolverConfig();
        Class cls = a;
        if (cls == null) {
            cls = a("org.xbill.DNS2.ResolverConfig");
            a = cls;
        }
        synchronized (cls) {
            e = resolverConfig;
        }
    }

    public ResolverConfig() {
        List arrayList = new ArrayList(0);
        List arrayList2 = new ArrayList(0);
        String property = System.getProperty("dns.server");
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ",");
            while (stringTokenizer.hasMoreTokens()) {
                h(stringTokenizer.nextToken(), arrayList);
            }
        }
        String property2 = System.getProperty("dns.search");
        if (property2 != null) {
            StringTokenizer stringTokenizer2 = new StringTokenizer(property2, ",");
            while (stringTokenizer2.hasMoreTokens()) {
                g(stringTokenizer2.nextToken(), arrayList2);
            }
        }
        c(arrayList, arrayList2);
        if (this.servers == null || this.c == null) {
            List arrayList3 = new ArrayList(0);
            List arrayList4 = new ArrayList(0);
            try {
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                Class<?> cls = Class.forName("sun.net.dns.ResolverConfiguration");
                Object invoke = cls.getDeclaredMethod("open", clsArr).invoke(null, objArr);
                List list = (List) cls.getMethod("nameservers", clsArr).invoke(invoke, objArr);
                List list2 = (List) cls.getMethod("searchlist", clsArr).invoke(invoke, objArr);
                if (list.size() != 0) {
                    if (list.size() > 0) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            h((String) it.next(), arrayList3);
                        }
                    }
                    if (list2.size() > 0) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            g((String) it2.next(), arrayList4);
                        }
                    }
                    c(arrayList3, arrayList4);
                    return;
                }
            } catch (Exception unused) {
            }
            if (this.servers == null || this.c == null) {
                String property3 = System.getProperty("os.name");
                String property4 = System.getProperty("java.vendor");
                if (property3.indexOf("Windows") != -1) {
                    try {
                        if (property3.indexOf("95") == -1 && property3.indexOf("98") == -1 && property3.indexOf("ME") == -1) {
                            Process exec = Runtime.getRuntime().exec("ipconfig /all");
                            e(exec.getInputStream());
                            exec.destroy();
                        } else {
                            Runtime runtime = Runtime.getRuntime();
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("winipcfg /all /batch ");
                            stringBuffer.append("winipcfg.out");
                            runtime.exec(stringBuffer.toString()).waitFor();
                            e(new FileInputStream(new File("winipcfg.out")));
                            new File("winipcfg.out").delete();
                        }
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                if (property3.indexOf("NetWare") != -1) {
                    d("sys:/etc/resolv.cfg");
                    return;
                }
                if (property4.indexOf("Android") == -1) {
                    d("/etc/resolv.conf");
                    return;
                }
                ArrayList arrayList5 = new ArrayList();
                List arrayList6 = new ArrayList();
                try {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    Class<?> cls3 = b;
                    if (cls3 == null) {
                        cls3 = a("java.lang.String");
                        b = cls3;
                    }
                    Method method = cls2.getMethod("get", cls3);
                    String[] strArr = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
                    for (int i = 0; i < 4; i++) {
                        String str = (String) method.invoke(null, strArr[i]);
                        if (str != null && ((str.matches("^\\d+(\\.\\d+){3}$") || str.matches("^[0-9a-f]+(:[0-9a-f]*)+:[0-9a-f]+$")) && !arrayList5.contains(str))) {
                            arrayList5.add(str);
                        }
                    }
                } catch (Exception unused3) {
                }
                c(arrayList5, arrayList6);
            }
        }
    }

    static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError().initCause(e2);
        }
    }

    public static synchronized ResolverConfig b() {
        ResolverConfig resolverConfig;
        synchronized (ResolverConfig.class) {
            resolverConfig = e;
        }
        return resolverConfig;
    }

    private final void c(List list, List list2) {
        if (this.servers == null && list.size() > 0) {
            this.servers = (String[]) list.toArray(new String[0]);
        }
        if (this.c != null || list2.size() <= 0) {
            return;
        }
        this.c = (fiyt[]) list2.toArray(new fiyt[0]);
    }

    private final void d(String str) {
        int parseInt;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            ArrayList arrayList = new ArrayList(0);
            ArrayList arrayList2 = new ArrayList(0);
            int i = -1;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.startsWith("nameserver")) {
                        StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                        stringTokenizer.nextToken();
                        h(stringTokenizer.nextToken(), arrayList);
                    } else if (readLine.startsWith("domain")) {
                        StringTokenizer stringTokenizer2 = new StringTokenizer(readLine);
                        stringTokenizer2.nextToken();
                        if (stringTokenizer2.hasMoreTokens() && arrayList2.isEmpty()) {
                            g(stringTokenizer2.nextToken(), arrayList2);
                        }
                    } else if (readLine.startsWith("search")) {
                        if (!arrayList2.isEmpty()) {
                            arrayList2.clear();
                        }
                        StringTokenizer stringTokenizer3 = new StringTokenizer(readLine);
                        stringTokenizer3.nextToken();
                        while (stringTokenizer3.hasMoreTokens()) {
                            g(stringTokenizer3.nextToken(), arrayList2);
                        }
                    } else if (readLine.startsWith("options")) {
                        StringTokenizer stringTokenizer4 = new StringTokenizer(readLine);
                        stringTokenizer4.nextToken();
                        while (stringTokenizer4.hasMoreTokens()) {
                            String nextToken = stringTokenizer4.nextToken();
                            if (nextToken.startsWith("ndots:")) {
                                String substring = nextToken.substring(6);
                                try {
                                    parseInt = Integer.parseInt(substring);
                                } catch (NumberFormatException unused) {
                                }
                                if (parseInt >= 0) {
                                    if (fiyy.a("verbose")) {
                                        PrintStream printStream = System.out;
                                        StringBuffer stringBuffer = new StringBuffer();
                                        stringBuffer.append("setting ndots ");
                                        stringBuffer.append(substring);
                                        printStream.println(stringBuffer.toString());
                                    }
                                    i = parseInt;
                                } else {
                                    i = -1;
                                }
                            }
                        }
                    }
                } catch (IOException unused2) {
                }
            }
            bufferedReader.close();
            c(arrayList, arrayList2);
            if (this.d >= 0 || i <= 0) {
                return;
            }
            this.d = i;
        } catch (FileNotFoundException unused3) {
        }
    }

    private final void e(InputStream inputStream) {
        int intValue = Integer.getInteger("org.xbill.DNS2.windows.parse.buffer", 8192).intValue();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, intValue);
        bufferedInputStream.mark(intValue);
        f(bufferedInputStream, null);
        if (this.servers == null) {
            try {
                bufferedInputStream.reset();
                f(bufferedInputStream, new Locale("", ""));
            } catch (IOException unused) {
            }
        }
    }

    private final void f(InputStream inputStream, Locale locale) {
        Class cls = a;
        if (cls == null) {
            cls = a("org.xbill.DNS2.ResolverConfig");
            a = cls;
        }
        String name = cls.getPackage().getName();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(name);
        stringBuffer.append(".windows.DNSServer");
        String stringBuffer2 = stringBuffer.toString();
        ResourceBundle bundle = locale != null ? ResourceBundle.getBundle(stringBuffer2, locale) : ResourceBundle.getBundle(stringBuffer2);
        String string = bundle.getString("host_name");
        String string2 = bundle.getString("primary_dns_suffix");
        String string3 = bundle.getString("dns_suffix");
        String string4 = bundle.getString("dns_servers");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            c(arrayList, arrayList2);
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                    if (!stringTokenizer.hasMoreTokens()) {
                        break;
                    }
                    String nextToken = stringTokenizer.nextToken();
                    boolean z3 = readLine.indexOf(":") == -1;
                    z &= z3;
                    z2 &= z3;
                    if (readLine.indexOf(string) != -1) {
                        while (stringTokenizer.hasMoreTokens()) {
                            nextToken = stringTokenizer.nextToken();
                        }
                        try {
                            if (fiyt.e(nextToken, null).a() != 1) {
                                g(nextToken, arrayList2);
                            }
                        } catch (fjad unused2) {
                        }
                    } else {
                        if (readLine.indexOf(string2) != -1) {
                            while (stringTokenizer.hasMoreTokens()) {
                                nextToken = stringTokenizer.nextToken();
                            }
                            if (!nextToken.equals(":")) {
                                g(nextToken, arrayList2);
                            }
                        } else {
                            if (!z && readLine.indexOf(string3) == -1) {
                                if (z2 || readLine.indexOf(string4) != -1) {
                                    while (stringTokenizer.hasMoreTokens()) {
                                        nextToken = stringTokenizer.nextToken();
                                    }
                                    if (!nextToken.equals(":")) {
                                        h(nextToken, arrayList);
                                        z2 = true;
                                        z = false;
                                    }
                                }
                            }
                            while (stringTokenizer.hasMoreTokens()) {
                                nextToken = stringTokenizer.nextToken();
                            }
                            if (!nextToken.equals(":")) {
                                g(nextToken, arrayList2);
                            }
                        }
                        z = true;
                    }
                }
            }
        } catch (IOException unused3) {
        }
    }

    private static final void g(String str, List list) {
        if (fiyy.a("verbose")) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer("adding search ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
        try {
            fiyt e2 = fiyt.e(str, fiyt.a);
            if (list.contains(e2)) {
                return;
            }
            list.add(e2);
        } catch (fjad unused) {
        }
    }

    private static final void h(String str, List list) {
        if (list.contains(str)) {
            return;
        }
        if (fiyy.a("verbose")) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer("adding server ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
        list.add(str);
    }
}
