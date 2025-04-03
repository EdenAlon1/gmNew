package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgzd implements fgzb {
    private static final Pattern a = Pattern.compile("(?<=/)[^/]*/[^/]*$");
    private static final Map b = new ConcurrentHashMap();
    private static final Properties c;
    private final String e = "zoneinfo/";
    private final Map d = new ConcurrentHashMap();

    static {
        Properties properties = new Properties();
        c = properties;
        try {
            properties.load(fheu.a("net/fortuna/ical4j/model/tz.alias"));
        } catch (IOException e) {
            LogFactory.getLog(fgzd.class).warn("Error loading timezone aliases: ".concat(String.valueOf(e.getMessage())));
        }
        try {
            c.load(fheu.a("tz.alias"));
        } catch (Exception e2) {
            LogFactory.getLog(fgzd.class).debug("Error loading custom timezone aliases: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    @Override // defpackage.fgzb
    public final fgza a(String str) {
        Exception e;
        fgza fgzaVar;
        fhaj fhajVar;
        URL url;
        fhee fheeVar;
        fgza fgzaVar2 = (fgza) this.d.get(str);
        if (fgzaVar2 != null) {
            return fgzaVar2;
        }
        Map map = b;
        fgza fgzaVar3 = (fgza) map.get(str);
        if (fgzaVar3 != null) {
            return fgzaVar3;
        }
        String property = c.getProperty(str);
        if (property != null) {
            return a(property);
        }
        synchronized (map) {
            fgza fgzaVar4 = (fgza) map.get(str);
            if (fgzaVar4 == null) {
                try {
                    String str2 = this.e + str + ".ics";
                    Log log = fheu.a;
                    fhajVar = null;
                    try {
                        url = Thread.currentThread().getContextClassLoader().getResource(str2);
                    } catch (SecurityException e2) {
                        fheu.a.info("Unable to access context classloader, using default. ".concat(String.valueOf(e2.getMessage())));
                        url = null;
                    }
                    if (url == null) {
                        url = fheu.class.getResource("/".concat(str2));
                    }
                    if (url != null) {
                        fhajVar = (fhaj) new fgtw().a(url.openStream()).a();
                        if (!"false".equals(fhem.a("net.fortuna.ical4j.timezone.update.enabled")) && (fheeVar = (fhee) fhajVar.a("TZURL")) != null) {
                            try {
                                fhaj fhajVar2 = (fhaj) new fgtw().a(fheeVar.c.toURL().openStream()).a();
                                if (fhajVar2 != null) {
                                    fhajVar = fhajVar2;
                                }
                            } catch (Exception e3) {
                                LogFactory.getLog(fgzd.class).warn("Unable to retrieve updates for timezone: ".concat(String.valueOf(((fhea) fhajVar.a("TZID")).c)), e3);
                            }
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    fgzaVar = fgzaVar4;
                }
                if (fhajVar != null) {
                    fgzaVar = new fgza(fhajVar);
                    try {
                        b.put(fgzaVar.getID(), fgzaVar);
                    } catch (Exception e5) {
                        e = e5;
                        LogFactory.getLog(fgzd.class).warn("Error occurred loading VTimeZone", e);
                        fgzaVar4 = fgzaVar;
                        return fgzaVar4;
                    }
                    fgzaVar4 = fgzaVar;
                } else if (fhel.b("ical4j.parsing.relaxed")) {
                    Matcher matcher = a.matcher(str);
                    if (matcher.find()) {
                        return a(matcher.group());
                    }
                }
            }
            return fgzaVar4;
        }
    }

    @Override // defpackage.fgzb
    public final void b(fgza fgzaVar) {
        this.d.put(fgzaVar.getID(), fgzaVar);
    }
}
